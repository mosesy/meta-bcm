# Adapted from linux-imx.inc, copyright (C) 2013, 2014 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "Linux kernel for BCM-SMARC module"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI = "git://github.com/bcmadvancedresearch/kernel_sma-imx6.git;branch=${SRCBRANCH}\
           file://defconfig"

#12/04/2015
SRCBRANCH = "3.14.28-1.0.0"
SRCREV = "4105ce423ff35dadcc9daa66f9034b13ebe3c42a"
DEPENDS += "lzop-native bc-native"
COMPATIBLE_MACHINE = "smarc"

