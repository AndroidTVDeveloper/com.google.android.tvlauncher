package defpackage;

import java.io.File;

/* renamed from: wd  reason: default package */
/* compiled from: PG */
final class wd implements vq {
    private final xw a;
    private volatile xy b;

    public wd(xw xwVar) {
        this.a = xwVar;
    }

    public final xy a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    yd ydVar = ((ye) this.a).a;
                    File cacheDir = ((yg) ydVar).a.getCacheDir();
                    yf yfVar = null;
                    File file = cacheDir != null ? new File(cacheDir, ((yg) ydVar).b) : null;
                    if (file != null && (file.mkdirs() || (file.exists() && file.isDirectory()))) {
                        yfVar = new yf(file);
                    }
                    this.b = yfVar;
                }
                if (this.b == null) {
                    this.b = new xz();
                }
            }
        }
        return this.b;
    }
}
