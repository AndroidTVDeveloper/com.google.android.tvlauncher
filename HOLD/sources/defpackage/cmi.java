package defpackage;

/* renamed from: cmi  reason: default package */
/* compiled from: PG */
public enum cmi {
    CUSTOM_CREATIVE,
    VAST,
    FORMAT_NOT_SET;

    public static cmi a(int i) {
        if (i == 0) {
            return FORMAT_NOT_SET;
        }
        if (i == 2) {
            return CUSTOM_CREATIVE;
        }
        if (i != 3) {
            return null;
        }
        return VAST;
    }
}
