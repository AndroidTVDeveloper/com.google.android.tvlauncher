package p000;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: aug */
/* compiled from: PG */
public final class aug {

    /* renamed from: a */
    private final ByteArrayOutputStream f2437a = new ByteArrayOutputStream(512);

    /* renamed from: b */
    private final DataOutputStream f2438b = new DataOutputStream(this.f2437a);

    /* renamed from: a */
    public final byte[] mo1368a(aue aue) {
        this.f2437a.reset();
        try {
            m2164a(this.f2438b, aue.f2431a);
            String str = aue.f2432b;
            if (str == null) {
                str = "";
            }
            m2164a(this.f2438b, str);
            m2163a(this.f2438b, aue.f2433c);
            m2163a(this.f2438b, aue.f2434d);
            this.f2438b.write(aue.f2435e);
            this.f2438b.flush();
            return this.f2437a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static void m2164a(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: a */
    private static void m2163a(DataOutputStream dataOutputStream, long j) {
        dataOutputStream.writeByte(((int) (j >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j) & 255);
    }
}
