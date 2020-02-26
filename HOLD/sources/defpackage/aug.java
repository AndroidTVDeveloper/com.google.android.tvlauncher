package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: aug  reason: default package */
/* compiled from: PG */
public final class aug {
    private final ByteArrayOutputStream a = new ByteArrayOutputStream(512);
    private final DataOutputStream b = new DataOutputStream(this.a);

    public final byte[] a(aue aue) {
        this.a.reset();
        try {
            a(this.b, aue.a);
            String str = aue.b;
            if (str == null) {
                str = "";
            }
            a(this.b, str);
            a(this.b, aue.c);
            a(this.b, aue.d);
            this.b.write(aue.e);
            this.b.flush();
            return this.a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void a(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    private static void a(DataOutputStream dataOutputStream, long j) {
        dataOutputStream.writeByte(((int) (j >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j) & 255);
    }
}
