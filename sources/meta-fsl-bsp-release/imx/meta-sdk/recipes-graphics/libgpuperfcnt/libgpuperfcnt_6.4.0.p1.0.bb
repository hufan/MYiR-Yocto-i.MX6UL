DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

SRC_URI[arm-fb.md5sum] = "be8f0d95565ca7f95c23a4985eeba344"
SRC_URI[arm-fb.sha256sum] = "264d2e5a8666ba72abdb34f85befd84327dbb0eae8158f033567247db0792eb0"

SRC_URI[arm-wayland.md5sum] = "a21804a10b7322c17593a6a51f1f2f4c"
SRC_URI[arm-wayland.sha256sum] = "e317c80fc163815d1e8797cf41360c36620b15736e7c606279577b615895e775"

SRC_URI[arm-x11.md5sum] = "e1b4d8a91f3e5cc35c6173981eaee2a7"
SRC_URI[arm-x11.sha256sum] = "83758b6da3a027fc1d372f7f7d19c926900e8e4b757026708abf8883e15d98a2"

SRC_URI[aarch64-fb.md5sum] = "90d5b00777e1a4d29c948df942d05c4b"
SRC_URI[aarch64-fb.sha256sum] = "afe7717f10496a582b96cf3c5214f2ee8f93d8f75d848d89337f64c12adeb5dc"

SRC_URI[aarch64-wayland.md5sum] = "93df2b24c1e6deeb6e99beebecfe1e6d"
SRC_URI[aarch64-wayland.sha256sum] = "6fba7781fb5f53275e8b249a1111561ad9f00b6a09184ee6869c661d203dfa5e"

SRC_URI[aarch64-x11.md5sum] = "bd8a5f1265bf44987aff5b84aee88fc5"
SRC_URI[aarch64-x11.sha256sum] = "91e9e7a238addef2ee4035e3ed71f34c1562b6449dbc2d632fc7b67bf8bcea27"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
