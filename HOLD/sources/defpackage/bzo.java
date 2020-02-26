package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: bzo  reason: default package */
/* compiled from: PG */
public final class bzo {
    private static final Charset a = Charset.forName("UTF-8");

    public static Long a(String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes(a));
            return Long.valueOf(ByteBuffer.wrap(instance.digest()).getLong());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
