package defpackage;

/* renamed from: avp  reason: default package */
/* compiled from: PG */
public abstract class avp implements atv {
    public final akh a() {
        return null;
    }

    public final byte[] b() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        return valueOf.length() == 0 ? new String("SCTE-35 splice command: type=") : "SCTE-35 splice command: type=".concat(valueOf);
    }
}
