package p000;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bkh */
/* compiled from: PG */
public final class bkh {

    /* renamed from: a */
    private static final Pattern f4210a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: b */
    private static final Pattern f4211b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c */
    private static final Pattern f4212c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: d */
    private static final Map f4213d;

    static {
        HashMap hashMap = new HashMap();
        f4213d = hashMap;
        hashMap.put("aliceblue", -984833);
        f4213d.put("antiquewhite", -332841);
        f4213d.put("aqua", -16711681);
        f4213d.put("aquamarine", -8388652);
        f4213d.put("azure", -983041);
        f4213d.put("beige", -657956);
        f4213d.put("bisque", -6972);
        f4213d.put("black", -16777216);
        f4213d.put("blanchedalmond", -5171);
        f4213d.put("blue", -16776961);
        f4213d.put("blueviolet", -7722014);
        f4213d.put("brown", -5952982);
        f4213d.put("burlywood", -2180985);
        f4213d.put("cadetblue", -10510688);
        f4213d.put("chartreuse", -8388864);
        f4213d.put("chocolate", -2987746);
        f4213d.put("coral", -32944);
        f4213d.put("cornflowerblue", -10185235);
        f4213d.put("cornsilk", -1828);
        f4213d.put("crimson", -2354116);
        f4213d.put("cyan", -16711681);
        f4213d.put("darkblue", -16777077);
        f4213d.put("darkcyan", -16741493);
        f4213d.put("darkgoldenrod", -4684277);
        f4213d.put("darkgray", -5658199);
        f4213d.put("darkgreen", -16751616);
        f4213d.put("darkgrey", -5658199);
        f4213d.put("darkkhaki", -4343957);
        f4213d.put("darkmagenta", -7667573);
        f4213d.put("darkolivegreen", -11179217);
        f4213d.put("darkorange", -29696);
        f4213d.put("darkorchid", -6737204);
        f4213d.put("darkred", -7667712);
        f4213d.put("darksalmon", -1468806);
        f4213d.put("darkseagreen", -7357297);
        f4213d.put("darkslateblue", -12042869);
        f4213d.put("darkslategray", -13676721);
        f4213d.put("darkslategrey", -13676721);
        f4213d.put("darkturquoise", -16724271);
        f4213d.put("darkviolet", -7077677);
        f4213d.put("deeppink", -60269);
        f4213d.put("deepskyblue", -16728065);
        f4213d.put("dimgray", -9868951);
        f4213d.put("dimgrey", -9868951);
        f4213d.put("dodgerblue", -14774017);
        f4213d.put("firebrick", -5103070);
        f4213d.put("floralwhite", -1296);
        f4213d.put("forestgreen", -14513374);
        f4213d.put("fuchsia", -65281);
        f4213d.put("gainsboro", -2302756);
        f4213d.put("ghostwhite", -460545);
        f4213d.put("gold", -10496);
        f4213d.put("goldenrod", -2448096);
        f4213d.put("gray", -8355712);
        f4213d.put("green", -16744448);
        f4213d.put("greenyellow", -5374161);
        f4213d.put("grey", -8355712);
        f4213d.put("honeydew", -983056);
        f4213d.put("hotpink", -38476);
        f4213d.put("indianred", -3318692);
        f4213d.put("indigo", -11861886);
        f4213d.put("ivory", -16);
        f4213d.put("khaki", -989556);
        f4213d.put("lavender", -1644806);
        f4213d.put("lavenderblush", -3851);
        f4213d.put("lawngreen", -8586240);
        f4213d.put("lemonchiffon", -1331);
        f4213d.put("lightblue", -5383962);
        f4213d.put("lightcoral", -1015680);
        f4213d.put("lightcyan", -2031617);
        f4213d.put("lightgoldenrodyellow", -329006);
        f4213d.put("lightgray", -2894893);
        f4213d.put("lightgreen", -7278960);
        f4213d.put("lightgrey", -2894893);
        f4213d.put("lightpink", -18751);
        f4213d.put("lightsalmon", -24454);
        f4213d.put("lightseagreen", -14634326);
        f4213d.put("lightskyblue", -7876870);
        f4213d.put("lightslategray", -8943463);
        f4213d.put("lightslategrey", -8943463);
        f4213d.put("lightsteelblue", -5192482);
        f4213d.put("lightyellow", -32);
        f4213d.put("lime", -16711936);
        f4213d.put("limegreen", -13447886);
        f4213d.put("linen", -331546);
        f4213d.put("magenta", -65281);
        f4213d.put("maroon", -8388608);
        f4213d.put("mediumaquamarine", -10039894);
        f4213d.put("mediumblue", -16777011);
        f4213d.put("mediumorchid", -4565549);
        f4213d.put("mediumpurple", -7114533);
        f4213d.put("mediumseagreen", -12799119);
        f4213d.put("mediumslateblue", -8689426);
        f4213d.put("mediumspringgreen", -16713062);
        f4213d.put("mediumturquoise", -12004916);
        f4213d.put("mediumvioletred", -3730043);
        f4213d.put("midnightblue", -15132304);
        f4213d.put("mintcream", -655366);
        f4213d.put("mistyrose", -6943);
        f4213d.put("moccasin", -6987);
        f4213d.put("navajowhite", -8531);
        f4213d.put("navy", -16777088);
        f4213d.put("oldlace", -133658);
        f4213d.put("olive", -8355840);
        f4213d.put("olivedrab", -9728477);
        f4213d.put("orange", -23296);
        f4213d.put("orangered", -47872);
        f4213d.put("orchid", -2461482);
        f4213d.put("palegoldenrod", -1120086);
        f4213d.put("palegreen", -6751336);
        f4213d.put("paleturquoise", -5247250);
        f4213d.put("palevioletred", -2396013);
        f4213d.put("papayawhip", -4139);
        f4213d.put("peachpuff", -9543);
        f4213d.put("peru", -3308225);
        f4213d.put("pink", -16181);
        f4213d.put("plum", -2252579);
        f4213d.put("powderblue", -5185306);
        f4213d.put("purple", -8388480);
        f4213d.put("rebeccapurple", -10079335);
        f4213d.put("red", -65536);
        f4213d.put("rosybrown", -4419697);
        f4213d.put("royalblue", -12490271);
        f4213d.put("saddlebrown", -7650029);
        f4213d.put("salmon", -360334);
        f4213d.put("sandybrown", -744352);
        f4213d.put("seagreen", -13726889);
        f4213d.put("seashell", -2578);
        f4213d.put("sienna", -6270419);
        f4213d.put("silver", -4144960);
        f4213d.put("skyblue", -7876885);
        f4213d.put("slateblue", -9807155);
        f4213d.put("slategray", -9404272);
        f4213d.put("slategrey", -9404272);
        f4213d.put("snow", -1286);
        f4213d.put("springgreen", -16711809);
        f4213d.put("steelblue", -12156236);
        f4213d.put("tan", -2968436);
        f4213d.put("teal", -16744320);
        f4213d.put("thistle", -2572328);
        f4213d.put("tomato", -40121);
        f4213d.put("transparent", 0);
        f4213d.put("turquoise", -12525360);
        f4213d.put("violet", -1146130);
        f4213d.put("wheat", -663885);
        f4213d.put("white", -1);
        f4213d.put("whitesmoke", -657931);
        f4213d.put("yellow", -256);
        f4213d.put("yellowgreen", -6632142);
    }

    /* renamed from: a */
    private static int m3486a(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* renamed from: a */
    private static int m3488a(String str, boolean z) {
        bks.m3510a(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return -16777216 | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & 255) << 24) | (parseLong >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (replace.startsWith("rgba")) {
            Matcher matcher = (!z ? f4211b : f4212c).matcher(replace);
            if (matcher.matches()) {
                return m3486a(z ? (int) (Float.parseFloat(matcher.group(4)) * 255.0f) : Integer.parseInt(matcher.group(4), 10), Integer.parseInt(matcher.group(1), 10), Integer.parseInt(matcher.group(2), 10), Integer.parseInt(matcher.group(3), 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = f4210a.matcher(replace);
            if (matcher2.matches()) {
                return m3486a(255, Integer.parseInt(matcher2.group(1), 10), Integer.parseInt(matcher2.group(2), 10), Integer.parseInt(matcher2.group(3), 10));
            }
        } else {
            Integer num = (Integer) f4213d.get(blm.m3675d(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public static int m3489b(String str) {
        return m3488a(str, true);
    }

    /* renamed from: a */
    public static int m3487a(String str) {
        return m3488a(str, false);
    }
}
