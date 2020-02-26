package p000;

import java.lang.ref.WeakReference;

/* renamed from: bny */
/* compiled from: PG */
abstract class bny extends bnw {

    /* renamed from: b */
    private static final WeakReference f4499b = new WeakReference(null);

    /* renamed from: a */
    private WeakReference f4500a = f4499b;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract byte[] mo2222d();

    public bny(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: a */
    public final byte[] mo2217a() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f4500a.get();
            if (bArr == null) {
                bArr = mo2222d();
                this.f4500a = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}
