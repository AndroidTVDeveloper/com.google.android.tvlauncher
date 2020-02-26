package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: bzo */
/* compiled from: PG */
public final class bzo {

    /* renamed from: a */
    private static final Charset f5061a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static Long m4422a(String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes(f5061a));
            return Long.valueOf(ByteBuffer.wrap(instance.digest()).getLong());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
