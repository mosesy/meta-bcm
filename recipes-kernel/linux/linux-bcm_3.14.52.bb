# Adapted from linux-imx.inc, copyright (C) 2013, 2014 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "Linux kernel for BCM boards"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI = "git://github.com/bcmadvancedresearch/linux-imx6.git;branch=${SRCBRANCH} \
           file://defconfig"

#11/4/2016
SRCBRANCH = "imx_3.14.52_1.1.0_ga-bcm"
SRCREV = "bb35153c67bc05b5d25e8d61baf07f723e2e501e"
DEPENDS += "lzop-native bc-native"
COMPATIBLE_MACHINE = "(ar6mx|ar6mxs|ar6mxq|ar6mxcs)"

DEFAULT_PREFERENCE = "1"
