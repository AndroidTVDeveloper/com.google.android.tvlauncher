package defpackage;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: bnw  reason: default package */
/* compiled from: PG */
abstract class bnw extends btq {
    private final int a;

    protected bnw(byte[] bArr) {
        boolean z;
        if (bArr.length == 25) {
            z = true;
        } else {
            z = false;
        }
        buh.b(z);
        this.a = Arrays.hashCode(bArr);
    }

    public abstract byte[] a();

    public final int c() {
        return this.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof btr)) {
            return false;
        }
        try {
            btr btr = (btr) obj;
            if (btr.c() != this.a) {
                return false;
            }
            return Arrays.equals(a(), (byte[]) ((bup) btr.b()).a);
        } catch (RemoteException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    protected static byte[] a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final buq b() {
        return new bup(a());
    }
}
