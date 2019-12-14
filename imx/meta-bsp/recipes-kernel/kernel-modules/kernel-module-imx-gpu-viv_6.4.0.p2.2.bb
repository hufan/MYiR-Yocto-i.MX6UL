require recipes-kernel/kernel-modules/kernel-module-imx-gpu-viv_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRCBRANCH = "lf-5.4.y"
LOCALVERSION = "-lts-${KERNEL_BRANCH}"
KERNEL_SRC = "git://bitbucket.sw.nxp.com/lfac/linux-lts-nxp.git;protocol=ssh"

SRCREV = "b60340a2ff720480625ca880c98623c7811916f4"