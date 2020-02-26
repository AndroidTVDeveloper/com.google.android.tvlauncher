package p000;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: bnw */
/* compiled from: PG */
abstract class bnw extends btq {

    /* renamed from: a */
    private final int f4497a;

    protected bnw(byte[] bArr) {
        boolean z;
        if (bArr.length == 25) {
            z = true;
        } else {
            z = false;
        }
        buh.m4212b(z);
        this.f4497a = Arrays.hashCode(bArr);
    }

    /* renamed from: a */
    public abstract byte[] mo2217a();

    /* renamed from: c */
    public final int mo2219c() {
        return this.f4497a;
    }

    public final int hashCode() {
        return this.f4497a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof btr)) {
            return false;
        }
        try {
            btr btr = (btr) obj;
            if (btr.mo2219c() != this.f4497a) {
                return false;
            }
            return Arrays.equals(mo2217a(), (byte[]) ((bup) btr.mo2218b()).f4857a);
        } catch (RemoteException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    /* renamed from: a */
    protected static byte[] m3802a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public final buq mo2218b() {
        return new bup(mo2217a());
    }
}
