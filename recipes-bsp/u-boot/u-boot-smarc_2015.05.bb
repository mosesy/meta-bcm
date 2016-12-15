require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=025bf9f768cbcb1a165dbe1a110babfb"
COMPATIBLE_MACHINE = "smarc"

PROVIDES = "u-boot"

PV = "uboot-smarc+git${SRCPV}"

SRCREV = "dfaff4e0a804815d1d153383b2ae68fe1ae2cd5e"
SRCBRANCH = "v2014.04"
SRC_URI = "git://github.com/bcmadvancedresearch/u-boot_sma-imx6;branch=${SRCBRANCH}"

PACKAGE_ARCH = "${MACHINE_ARCH}"

