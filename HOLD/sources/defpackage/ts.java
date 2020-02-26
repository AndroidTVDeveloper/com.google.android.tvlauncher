package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: ts  reason: default package */
/* compiled from: PG */
public interface ts {
    public static final Charset a = Charset.forName("UTF-8");

    void a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
