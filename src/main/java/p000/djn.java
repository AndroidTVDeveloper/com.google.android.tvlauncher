package p000;

import java.io.IOException;

/* renamed from: djn */
/* compiled from: PG */
public class djn extends IOException {
    public static final long serialVersionUID = -1616151763072450476L;

    public djn(String str) {
        super(str);
    }

    /* renamed from: c */
    static djn m6733c() {
        return new djn("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: f */
    static djn m6736f() {
        return new djn("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    static djm m6734d() {
        return new djm("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    static djn m6732b() {
        return new djn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: e */
    static djn m6735e() {
        return new djn("Failed to parse the message.");
    }

    /* renamed from: a */
    static djn m6731a() {
        return new djn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
