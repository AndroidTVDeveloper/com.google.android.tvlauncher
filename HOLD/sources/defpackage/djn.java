package defpackage;

import java.io.IOException;

/* renamed from: djn  reason: default package */
/* compiled from: PG */
public class djn extends IOException {
    public static final long serialVersionUID = -1616151763072450476L;

    public djn(String str) {
        super(str);
    }

    static djn c() {
        return new djn("Protocol message contained an invalid tag (zero).");
    }

    static djn f() {
        return new djn("Protocol message had invalid UTF-8.");
    }

    static djm d() {
        return new djm("Protocol message tag had invalid wire type.");
    }

    static djn b() {
        return new djn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static djn e() {
        return new djn("Failed to parse the message.");
    }

    static djn a() {
        return new djn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
