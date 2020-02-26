package p000;

/* renamed from: dch */
/* compiled from: PG */
public enum dch {
    APPS_OEM_GAMES("apps_oem_games"),
    APPS_GAMES_OEM("apps_games_oem"),
    GAMES_APPS_OEM("games_apps_oem"),
    APPS_OEM("apps_oem");
    

    /* renamed from: b */
    public final String f8223b;

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static dch m6120a(String str) {
        char c;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 315532620:
                if (str.equals("apps_games_oem")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1185685002:
                if (str.equals("apps_oem")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1234273356:
                if (str.equals("apps_oem_games")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1305388488:
                if (str.equals("games_apps_oem")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return APPS_OEM_GAMES;
        }
        if (c == 1) {
            return APPS_GAMES_OEM;
        }
        if (c == 2) {
            return GAMES_APPS_OEM;
        }
        if (c != 3) {
            return null;
        }
        return APPS_OEM;
    }

    private dch(String str) {
        this.f8223b = str;
    }
}
