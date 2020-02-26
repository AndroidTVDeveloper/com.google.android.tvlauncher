package p000;

import java.io.IOException;

/* renamed from: dhu */
/* compiled from: PG */
public abstract class dhu implements dkk {

    /* renamed from: z */
    public int f8563z = 0;

    /* renamed from: a */
    public void mo4369a(int i) {
        throw null;
    }

    /* renamed from: k */
    public int mo4372k() {
        throw null;
    }

    /* renamed from: j */
    public final byte[] mo4371j() {
        try {
            byte[] bArr = new byte[mo4517m()];
            din a = din.m6539a(bArr);
            mo4512a(a);
            a.mo4423a();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: i */
    public final dik mo4370i() {
        try {
            dig d = dik.m6516d(mo4517m());
            mo4512a(d.f8579a);
            return d.mo4412a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
