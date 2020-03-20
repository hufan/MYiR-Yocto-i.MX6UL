require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "ec60e831fbc588b49aeb852aa824d268"
SRC_URI[aarch64.sha256sum] = "35885f435dbe951d2c0f439a376ed8a59a50b67a1b7e1e14fa2ab03995abb1ad"
SRC_URI[arm.md5sum] = "c7c5a9f6cd45b1a716d0f41479919c9e"
SRC_URI[arm.sha256sum] = "6d6d02d035d988cbdb2014794f2efe970a3f5ac277202882bbf553bb7fd789d2"
