package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: bny  reason: default package */
/* compiled from: PG */
abstract class bny extends bnw {
    private static final WeakReference b = new WeakReference(null);
    private WeakReference a = b;

    /* access modifiers changed from: protected */
    public abstract byte[] d();

    public bny(byte[] bArr) {
        super(bArr);
    }

    public final byte[] a() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.a.get();
            if (bArr == null) {
                bArr = d();
                this.a = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}
