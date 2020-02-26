package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: aom  reason: default package */
/* compiled from: PG */
public final class aom {
    private static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a() {
        return (this.a == -1 || this.b == -1) ? false : true;
    }

    private final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1), 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.a = parseInt;
            this.b = parseInt2;
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public final void a(atw atw) {
        for (int i = 0; i < atw.a(); i++) {
            atv a2 = atw.a(i);
            if (a2 instanceof aux) {
                aux aux = (aux) a2;
                if ("iTunSMPB".equals(aux.a) && a(aux.b)) {
                    return;
                }
            } else if (a2 instanceof ave) {
                ave ave = (ave) a2;
                if ("com.apple.iTunes".equals(ave.a) && "iTunSMPB".equals(ave.b) && a(ave.d)) {
                    return;
                }
            } else {
                continue;
            }
        }
    }
}
