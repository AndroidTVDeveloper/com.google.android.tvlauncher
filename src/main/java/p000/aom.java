package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: aom */
/* compiled from: PG */
public final class aom {

    /* renamed from: c */
    private static final Pattern f1496c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f1497a = -1;

    /* renamed from: b */
    public int f1498b = -1;

    /* renamed from: a */
    public final boolean mo1214a() {
        return (this.f1497a == -1 || this.f1498b == -1) ? false : true;
    }

    /* renamed from: a */
    private final boolean m1668a(String str) {
        Matcher matcher = f1496c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1), 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f1497a = parseInt;
            this.f1498b = parseInt2;
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo1213a(atw atw) {
        for (int i = 0; i < atw.mo1344a(); i++) {
            atv a = atw.mo1345a(i);
            if (a instanceof aux) {
                aux aux = (aux) a;
                if ("iTunSMPB".equals(aux.f2473a) && m1668a(aux.f2474b)) {
                    return;
                }
            } else if (a instanceof ave) {
                ave ave = (ave) a;
                if ("com.apple.iTunes".equals(ave.f2484a) && "iTunSMPB".equals(ave.f2485b) && m1668a(ave.f2486d)) {
                    return;
                }
            } else {
                continue;
            }
        }
    }
}
