DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[arm-fb.md5sum] = "2d106ed1e59f4c45623eca495809bb77"
SRC_URI[arm-fb.sha256sum] = "db96178c51dd50f449e761367e6145fc1fba12db162ba76e7dfc9e9e6e45a29b"

SRC_URI[arm-wayland.md5sum] = "572979637d78172c960d48bc3cb04b0b"
SRC_URI[arm-wayland.sha256sum] = "b2a9ac5462528c33f2138682814d7ff372961d48a83cc397e87f47cee0d84d55"

SRC_URI[arm-x11.md5sum] = "4814a02a44516946c0b9fb01aa03e844"
SRC_URI[arm-x11.sha256sum] = "e4fb55c35f3f67db9df9f375e3c1c57316cf7a832303fb960e1b9a14c6999ee6"

SRC_URI[aarch64-fb.md5sum] = "419fc51accdcde75369ffeafcc7f4024"
SRC_URI[aarch64-fb.sha256sum] = "8db0c98d3a07d23f39819d7a7c5932032aacc34785bdb37acfff5f079c159b98"

SRC_URI[aarch64-wayland.md5sum] = "a1bf48ac79887e923d1bbb223906203b"
SRC_URI[aarch64-wayland.sha256sum] = "c8a6c6bceebf6654b183c53d6570aebbaa16719762f905a3f77d417e17a08609"

SRC_URI[aarch64-x11.md5sum] = "b4a336f74298228c41a8166724c4410f"
SRC_URI[aarch64-x11.sha256sum] = "567cdcc813962c87d545a11022de17de50ab37335cdffcf80ee53736f83945fa"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

do_install_append () {
    # replace .so with symlink
    rm ${D}${D_SUBDIR}${libdir}/libgpuperfcnt.so
    ln -s libgpuperfcnt.so.${PV} ${D}${D_SUBDIR}${libdir}/libgpuperfcnt.so
}

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
