package defpackage;

/* renamed from: cmb  reason: default package */
/* compiled from: PG */
public enum cmb {
    DIRECT_AD_CONFIG,
    DOUBLECLICK_AD_CONFIG,
    TYPE_NOT_SET;

    public static cmb a(int i) {
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
