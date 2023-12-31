# Copyright (C) 2014 O.S. Systems Software LTDA.
# Copyright (C) 2014-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP

# Re-use the u-boot-imx recipe and its files
require u-boot-imx_${PV}.bb
FILESEXTRAPATHS:prepend := "${THISDIR}/u-boot-imx:"

require u-boot-mfgtool.inc

UUU_BOOTLOADER_TAGGED     = ""
UUU_BOOTLOADER_TAGGED:mx6-nxp-bsp = "u-boot-mfgtool-tagged.${UBOOT_SUFFIX}"
UUU_BOOTLOADER_TAGGED:mx7-nxp-bsp = "u-boot-mfgtool-tagged.${UBOOT_SUFFIX}"
