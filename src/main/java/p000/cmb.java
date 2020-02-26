package p000;

/* renamed from: cmb */
/* compiled from: PG */
public enum cmb {
    DIRECT_AD_CONFIG,
    DOUBLECLICK_AD_CONFIG,
    TYPE_NOT_SET;

    /* renamed from: a */
    public static cmb m5106a(int i) {
        if (i == 0) {
            return TYPE_NOT_SET;
        }
        if (i == 1) {
            return DIRECT_AD_CONFIG;
        }
        if (i != 2) {
            return null;
        }
        return DOUBLECLICK_AD_CONFIG;
    }
}
