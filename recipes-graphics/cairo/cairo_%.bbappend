PACKAGECONFIG:append:imxgpu3d = " egl glesv2"
PACKAGECONFIG:remove:imxgpu3d = "opengl"

# links with imx-gpu libs which are pre-built for glibc
# gcompat will address it during runtime
LDFLAGS:append:imxgpu:libc-musl = " -Wl,--allow-shlib-undefined"

RDEPENDS:${PN}:append:imxgpu:libc-musl = " gcompat"
