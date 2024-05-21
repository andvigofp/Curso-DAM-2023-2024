#!/bin/bash
links_path="/opt/odoo/odoo_16/src/linked"
links_path="$(readlink -f ${links_path})"
src_path='/opt/odoo/odoo_16/src/oca'
mkdir -p ${links_path}
dir_skip1="__unported__"
dir_skip2="__unreviewed__"
dir_skip3="tests"
declare -i modules_total=0
declare -i modules_linked=0
declare -i modules_skipped=0
echo "---> START LINKING!"
echo "Odoo modules source path: ${src_path}"
echo "Odoo linked modules path: ${links_path}"
cd "${src_path}"
pwd
declare -a modules=$(find -type f -name "__manifest__.py" | sort -r)
for manifest in ${modules[@]}; do
module_path="$(dirname $(readlink -f ${manifest}))"
echo "PATH: ${module_path}"
unported=`echo ${module_path} | grep -c "${dir_skip1}"`
unreviewed=`echo ${module_path} | grep -c "${dir_skip2}"`
tests=`echo ${module_path} | grep -c "${dir_skip3}"`
modules_total+=1
module_name="$(basename ${module_path})"
if [[ "${unported}" != "0" || "${unreviewed}" != "0" || "${tests}" != "0" ]] ; then
echo "---> Skipped: ${module_name}"
modules_skipped+=1
continue
else
echo "OK > LINKING: ${module_name}"
ln -s "${module_path}" "${links_path}"
modules_linked+=1
fi
echo "L/S (T): ${modules_linked}/${modules_skipped} (${modules_total})"
done
echo "---"
echo "Odoo modules source path: ${src_path}"
echo "Odoo linked modules path: ${links_path}"
echo "---"
echo "Linked modules : ${modules_linked}"
echo "Skipped modules : ${modules_skipped}"
echo "Total modules : ${modules_total}"
echo "---"
echo "---> ENDED LINKING!"
