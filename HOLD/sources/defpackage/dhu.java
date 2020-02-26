package defpackage;

import java.io.IOException;

/* renamed from: dhu  reason: default package */
/* compiled from: PG */
public abstract class dhu implements dkk {
    public int z = 0;

    public void a(int i) {
        throw null;
    }

    public int k() {
        throw null;
    }

    public final byte[] j() {
        try {
            byte[] bArr = new byte[m()];
            din a = din.a(bArr);
            a(a);
            a.a();
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

    public final dik i() {
        try {
            dig d = dik.d(m());
            a(d.a);
            return d.a();
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
