package p000;

/* renamed from: cmf */
/* compiled from: PG */
public enum cmf {
    APP_INSTALL_CREATIVE_INFO,
    CONTENT_CREATIVE_INFO,
    FORMATINFO_NOT_SET;

    /* renamed from: a */
    public static cmf m5110a(int i) {
        if (i == 0) {
            return FORMATINFO_NOT_SET;
        }
        if (i == 5) {
            return APP_INSTALL_CREATIVE_INFO;
        }
        if (i != 6) {
            return null;
        }
        return CONTENT_CREATIVE_INFO;
    }
}
