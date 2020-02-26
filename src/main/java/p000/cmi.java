package p000;

/* renamed from: cmi */
/* compiled from: PG */
public enum cmi {
    CUSTOM_CREATIVE,
    VAST,
    FORMAT_NOT_SET;

    /* renamed from: a */
    public static cmi m5113a(int i) {
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
