package p000;

import java.io.File;

/* renamed from: wd */
/* compiled from: PG */
final class C0600wd implements C0586vq {

    /* renamed from: a */
    private final C0646xw f10664a;

    /* renamed from: b */
    private volatile C0648xy f10665b;

    public C0600wd(C0646xw xwVar) {
        this.f10664a = xwVar;
    }

    /* renamed from: a */
    public final C0648xy mo6038a() {
        if (this.f10665b == null) {
            synchronized (this) {
                if (this.f10665b == null) {
                    C0654yd ydVar = ((C0655ye) this.f10664a).f10810a;
                    File cacheDir = ((C0657yg) ydVar).f10815a.getCacheDir();
                    C0656yf yfVar = null;
                    File file = cacheDir != null ? new File(cacheDir, ((C0657yg) ydVar).f10816b) : null;
                    if (file != null && (file.mkdirs() || (file.exists() && file.isDirectory()))) {
                        yfVar = new C0656yf(file);
                    }
                    this.f10665b = yfVar;
                }
                if (this.f10665b == null) {
                    this.f10665b = new C0649xz();
                }
            }
        }
        return this.f10665b;
    }
}
