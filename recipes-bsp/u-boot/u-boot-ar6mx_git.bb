require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=c7383a594871c03da76b3707929d2919"
COMPATIBLE_MACHINE = "ar6mxq"

PROVIDES = "u-boot"

PV = "ar6mx-v2015.04-rc4+git${SRCPV}"

SRCREV = "cc7e3c9d778a53579ad54842239d57a4095f8d89"
SRCBRANCH = "ar6mx-v2015.04-rc4"
SRC_URI = "git://github.com/bcmadvancedresearch/u-boot-imx.git;branch=${SRCBRANCH} \
           file://uEnv.txt \
          "

S = "${WORKDIR}/git"

UENV_FILENAME ?= "uEnv-${MACHINE}.txt"

deploy_uenv () {
    install ${WORKDIR}/uEnv.txt ${DEPLOYDIR}/${UENV_FILENAME}
}

do_deploy[postfuncs] += "deploy_uenv"

PACKAGE_ARCH = "${MACHINE_ARCH}"

