package defpackage;

import android.text.Html;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bev  reason: default package */
/* compiled from: PG */
public final class bev extends anm {
    private static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");
    private static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder f = new StringBuilder();
    private final ArrayList g = new ArrayList();

    private static float a(int i) {
        if (i != 0) {
            return i != 1 ? 0.92f : 0.5f;
        }
        return 0.08f;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    public final bdl a(byte[] bArr, int i, boolean z) {
        boolean z2;
        String str;
        bdj bdj;
        char c;
        int i2;
        char c2;
        ArrayList arrayList = new ArrayList();
        bkq bkq = new bkq();
        bky bky = new bky(bArr, i);
        while (true) {
            String r = bky.r();
            if (r != null) {
                if (r.length() != 0) {
                    try {
                        Integer.parseInt(r);
                        String r2 = bky.r();
                        if (r2 != null) {
                            Matcher matcher = d.matcher(r2);
                            if (matcher.matches()) {
                                bkq.a(a(matcher, 1));
                                if (!TextUtils.isEmpty(matcher.group(6))) {
                                    bkq.a(a(matcher, 6));
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                this.f.setLength(0);
                                this.g.clear();
                                for (String r3 = bky.r(); !TextUtils.isEmpty(r3); r3 = bky.r()) {
                                    if (this.f.length() > 0) {
                                        this.f.append("<br>");
                                    }
                                    StringBuilder sb = this.f;
                                    ArrayList arrayList2 = this.g;
                                    String trim = r3.trim();
                                    StringBuilder sb2 = new StringBuilder(trim);
                                    Matcher matcher2 = e.matcher(trim);
                                    int i3 = 0;
                                    while (matcher2.find()) {
                                        String group = matcher2.group();
                                        arrayList2.add(group);
                                        int start = matcher2.start() - i3;
                                        int length = group.length();
                                        sb2.replace(start, start + length, "");
                                        i3 += length;
                                    }
                                    sb.append(sb2.toString());
                                }
                                Spanned fromHtml = Html.fromHtml(this.f.toString());
                                int i4 = 0;
                                while (true) {
                                    if (i4 < this.g.size()) {
                                        str = (String) this.g.get(i4);
                                        if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                            i4++;
                                        }
                                    } else {
                                        str = null;
                                    }
                                }
                                if (str == null) {
                                    bdj = new bdj(fromHtml);
                                } else {
                                    switch (str.hashCode()) {
                                        case -685620710:
                                            if (str.equals("{\\an1}")) {
                                                c = 0;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -685620648:
                                            if (str.equals("{\\an3}")) {
                                                c = 3;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -685620617:
                                            if (str.equals("{\\an4}")) {
                                                c = 1;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -685620555:
                                            if (str.equals("{\\an6}")) {
                                                c = 4;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -685620524:
                                            if (str.equals("{\\an7}")) {
                                                c = 2;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -685620462:
                                            if (str.equals("{\\an9}")) {
                                                c = 5;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        default:
                                            c = 65535;
                                            break;
                                    }
                                    if (c == 0 || c == 1 || c == 2) {
                                        i2 = 0;
                                    } else {
                                        i2 = (c == 3 || c == 4 || c == 5) ? 2 : 1;
                                    }
                                    switch (str.hashCode()) {
                                        case -685620710:
                                            if (str.equals("{\\an1}")) {
                                                c2 = 0;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -685620679:
                                            if (str.equals("{\\an2}")) {
                                                c2 = 1;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -685620648:
                                            if (str.equals("{\\an3}")) {
                                                c2 = 2;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -685620524:
                                            if (str.equals("{\\an7}")) {
                                                c2 = 3;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -685620493:
                                            if (str.equals("{\\an8}")) {
                                                c2 = 4;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -685620462:
                                            if (str.equals("{\\an9}")) {
                                                c2 = 5;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        default:
                                            c2 = 65535;
                                            break;
                                    }
                                    int i5 = (c2 == 0 || c2 == 1 || c2 == 2) ? 2 : (c2 == 3 || c2 == 4 || c2 == 5) ? 0 : 1;
                                    bdj = new bdj(fromHtml, (Layout.Alignment) null, a(i5), 0, i5, a(i2), i2, -3.4028235E38f);
                                }
                                arrayList.add(bdj);
                                if (z2) {
                                    arrayList.add(bdj.a);
                                }
                            } else {
                                Log.w("SubripDecoder", r2.length() == 0 ? new String("Skipping invalid timing: ") : "Skipping invalid timing: ".concat(r2));
                            }
                        } else {
                            Log.w("SubripDecoder", "Unexpected end");
                        }
                    } catch (NumberFormatException e2) {
                        Log.w("SubripDecoder", r.length() == 0 ? new String("Skipping invalid index: ") : "Skipping invalid index: ".concat(r));
                    }
                }
            }
        }
        bdj[] bdjArr = new bdj[arrayList.size()];
        arrayList.toArray(bdjArr);
        return new bew(bdjArr, bkq.a());
    }

    private static long a(Matcher matcher, int i) {
        return ((Long.parseLong(matcher.group(i + 1)) * 3600000) + (Long.parseLong(matcher.group(i + 2)) * 60000) + (Long.parseLong(matcher.group(i + 3)) * 1000) + Long.parseLong(matcher.group(i + 4))) * 1000;
    }
}
