package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bfp  reason: default package */
/* compiled from: PG */
public final class bfp {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern c = Pattern.compile("(\\S+?):(\\S+)");
    public final StringBuilder b = new StringBuilder();

    /* JADX WARNING: Removed duplicated region for block: B:38:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.lang.String r16, defpackage.bfn r17, android.text.SpannableStringBuilder r18, java.util.List r19, java.util.List r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r20
            int r3 = r0.b
            int r4 = r18.length()
            java.lang.String r5 = r0.a
            int r6 = r5.hashCode()
            r9 = 2
            r10 = 1
            r11 = 0
            if (r6 == 0) goto L_0x006e
            r12 = 105(0x69, float:1.47E-43)
            if (r6 == r12) goto L_0x0064
            r12 = 3314158(0x3291ee, float:4.644125E-39)
            if (r6 == r12) goto L_0x0059
            r12 = 98
            if (r6 == r12) goto L_0x004f
            r12 = 99
            if (r6 == r12) goto L_0x0045
            r12 = 117(0x75, float:1.64E-43)
            if (r6 == r12) goto L_0x003b
            r12 = 118(0x76, float:1.65E-43)
            if (r6 == r12) goto L_0x0031
        L_0x0030:
            goto L_0x0078
        L_0x0031:
            java.lang.String r6 = "v"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0030
            r5 = 5
            goto L_0x0079
        L_0x003b:
            java.lang.String r6 = "u"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0030
            r5 = 2
            goto L_0x0079
        L_0x0045:
            java.lang.String r6 = "c"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0030
            r5 = 3
            goto L_0x0079
        L_0x004f:
            java.lang.String r6 = "b"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0030
            r5 = 0
            goto L_0x0079
        L_0x0059:
            java.lang.String r6 = "lang"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0030
            r5 = 4
            goto L_0x0079
        L_0x0064:
            java.lang.String r6 = "i"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0030
            r5 = 1
            goto L_0x0079
        L_0x006e:
            java.lang.String r6 = ""
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0030
            r5 = 6
            goto L_0x0079
        L_0x0078:
            r5 = -1
        L_0x0079:
            r6 = 33
            switch(r5) {
                case 0: goto L_0x0091;
                case 1: goto L_0x0088;
                case 2: goto L_0x007f;
                case 3: goto L_0x0099;
                case 4: goto L_0x0099;
                case 5: goto L_0x0099;
                case 6: goto L_0x0099;
                default: goto L_0x007e;
            }
        L_0x007e:
            return
        L_0x007f:
            android.text.style.UnderlineSpan r5 = new android.text.style.UnderlineSpan
            r5.<init>()
            r1.setSpan(r5, r3, r4, r6)
            goto L_0x0099
        L_0x0088:
            android.text.style.StyleSpan r5 = new android.text.style.StyleSpan
            r5.<init>(r9)
            r1.setSpan(r5, r3, r4, r6)
            goto L_0x0099
        L_0x0091:
            android.text.style.StyleSpan r5 = new android.text.style.StyleSpan
            r5.<init>(r10)
            r1.setSpan(r5, r3, r4, r6)
        L_0x0099:
            r20.clear()
            int r5 = r19.size()
            r12 = 0
        L_0x00a1:
            if (r12 >= r5) goto L_0x0121
            r13 = r19
            java.lang.Object r14 = r13.get(r12)
            bfk r14 = (defpackage.bfk) r14
            java.lang.String r15 = r0.a
            java.lang.String[] r10 = r0.d
            java.lang.String r6 = r0.c
            java.lang.String r8 = r14.a
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x00da
            java.lang.String r8 = r14.b
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x00da
            java.util.List r8 = r14.c
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x00da
            java.lang.String r8 = r14.d
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x00da
            boolean r6 = android.text.TextUtils.isEmpty(r15)
            r9 = r16
            r8 = 2
            r11 = 4
            goto L_0x010f
        L_0x00da:
            java.lang.String r8 = r14.a
            r7 = 1073741824(0x40000000, float:2.0)
            r9 = r16
            int r7 = defpackage.bfk.a(r11, r8, r9, r7)
            java.lang.String r8 = r14.b
            r11 = 2
            int r7 = defpackage.bfk.a(r7, r8, r15, r11)
            java.lang.String r8 = r14.d
            r11 = 4
            int r6 = defpackage.bfk.a(r7, r8, r6, r11)
            r7 = -1
            if (r6 == r7) goto L_0x010d
            java.util.List r7 = java.util.Arrays.asList(r10)
            java.util.List r8 = r14.c
            boolean r7 = r7.containsAll(r8)
            if (r7 == 0) goto L_0x010b
            java.util.List r7 = r14.c
            int r7 = r7.size()
            r8 = 2
            int r7 = r7 << r8
            int r6 = r6 + r7
            goto L_0x010f
        L_0x010b:
            r8 = 2
            goto L_0x010e
        L_0x010d:
            r8 = 2
        L_0x010e:
            r6 = 0
        L_0x010f:
            if (r6 <= 0) goto L_0x0119
            bfo r7 = new bfo
            r7.<init>(r6, r14)
            r2.add(r7)
        L_0x0119:
            int r12 = r12 + 1
            r6 = 33
            r9 = 2
            r10 = 1
            r11 = 0
            goto L_0x00a1
        L_0x0121:
            java.util.Collections.sort(r20)
            int r0 = r20.size()
            r5 = 0
        L_0x0129:
            if (r5 >= r0) goto L_0x0191
            java.lang.Object r6 = r2.get(r5)
            bfo r6 = (defpackage.bfo) r6
            bfk r6 = r6.a
            if (r6 != 0) goto L_0x013a
            r8 = -1
            r9 = 33
            r10 = 1
            goto L_0x018e
        L_0x013a:
            int r7 = r6.a()
            r8 = -1
            if (r7 == r8) goto L_0x0150
            android.text.style.StyleSpan r7 = new android.text.style.StyleSpan
            int r9 = r6.a()
            r7.<init>(r9)
            r9 = 33
            r1.setSpan(r7, r3, r4, r9)
            goto L_0x0152
        L_0x0150:
            r9 = 33
        L_0x0152:
            int r7 = r6.j
            r10 = 1
            if (r7 != r10) goto L_0x015f
            android.text.style.UnderlineSpan r7 = new android.text.style.UnderlineSpan
            r7.<init>()
            r1.setSpan(r7, r3, r4, r9)
        L_0x015f:
            boolean r7 = r6.g
            if (r7 == 0) goto L_0x016f
            android.text.style.ForegroundColorSpan r7 = new android.text.style.ForegroundColorSpan
            int r9 = r6.f
            r7.<init>(r9)
            r9 = 33
            r1.setSpan(r7, r3, r4, r9)
        L_0x016f:
            boolean r7 = r6.i
            if (r7 == 0) goto L_0x0180
            android.text.style.BackgroundColorSpan r7 = new android.text.style.BackgroundColorSpan
            int r9 = r6.h
            r7.<init>(r9)
            r9 = 33
            r1.setSpan(r7, r3, r4, r9)
            goto L_0x0182
        L_0x0180:
            r9 = 33
        L_0x0182:
            java.lang.String r6 = r6.e
            if (r6 == 0) goto L_0x018e
            android.text.style.TypefaceSpan r7 = new android.text.style.TypefaceSpan
            r7.<init>(r6)
            r1.setSpan(r7, r3, r4, r9)
        L_0x018e:
            int r5 = r5 + 1
            goto L_0x0129
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfp.a(java.lang.String, bfn, android.text.SpannableStringBuilder, java.util.List, java.util.List):void");
    }

    public static boolean a(String str, Matcher matcher, bky bky, bfl bfl, StringBuilder sb, List list) {
        try {
            bfl.a = bfr.a(matcher.group(1));
            bfl.b = bfr.a(matcher.group(2));
            a(matcher.group(3), bfl);
            sb.setLength(0);
            String r = bky.r();
            while (!TextUtils.isEmpty(r)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(r.trim());
                r = bky.r();
            }
            a(str, sb.toString(), bfl, list);
            return true;
        } catch (NumberFormatException e) {
            String valueOf = String.valueOf(matcher.group());
            Log.w("WebvttCueParser", valueOf.length() == 0 ? new String("Skipping cue with bad header: ") : "Skipping cue with bad header: ".concat(valueOf));
            return false;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a5, code lost:
        if (r4.equals("start") != false) goto L_0x00db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(java.lang.String r10, defpackage.bfl r11) {
        /*
            java.lang.String r0 = "WebvttCueParser"
            java.util.regex.Pattern r1 = defpackage.bfp.c
            java.util.regex.Matcher r10 = r1.matcher(r10)
        L_0x0008:
            boolean r1 = r10.find()
            if (r1 == 0) goto L_0x016d
            r1 = 1
            java.lang.String r2 = r10.group(r1)
            r3 = 2
            java.lang.String r4 = r10.group(r3)
            java.lang.String r5 = "line"
            boolean r5 = r5.equals(r2)     // Catch:{ NumberFormatException -> 0x014d }
            r6 = 44
            r7 = 0
            r8 = -1
            if (r5 != 0) goto L_0x0115
            java.lang.String r5 = "align"
            boolean r5 = r5.equals(r2)     // Catch:{ NumberFormatException -> 0x014d }
            if (r5 != 0) goto L_0x0093
            java.lang.String r1 = "position"
            boolean r1 = r1.equals(r2)     // Catch:{ NumberFormatException -> 0x014d }
            if (r1 != 0) goto L_0x0073
            java.lang.String r1 = "size"
            boolean r1 = r1.equals(r2)     // Catch:{ NumberFormatException -> 0x014d }
            if (r1 != 0) goto L_0x006c
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ NumberFormatException -> 0x014d }
            int r1 = r1.length()     // Catch:{ NumberFormatException -> 0x014d }
            int r1 = r1 + 21
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch:{ NumberFormatException -> 0x014d }
            int r3 = r3.length()     // Catch:{ NumberFormatException -> 0x014d }
            int r1 = r1 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x014d }
            r3.<init>(r1)     // Catch:{ NumberFormatException -> 0x014d }
            java.lang.String r1 = "Unknown cue setting "
            r3.append(r1)     // Catch:{ NumberFormatException -> 0x014d }
            r3.append(r2)     // Catch:{ NumberFormatException -> 0x014d }
            java.lang.String r1 = ":"
            r3.append(r1)     // Catch:{ NumberFormatException -> 0x014d }
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x014d }
            java.lang.String r1 = r3.toString()     // Catch:{ NumberFormatException -> 0x014d }
            android.util.Log.w(r0, r1)     // Catch:{ NumberFormatException -> 0x014d }
            goto L_0x0008
        L_0x006c:
            float r1 = defpackage.bfr.b(r4)     // Catch:{ NumberFormatException -> 0x014d }
            r11.j = r1     // Catch:{ NumberFormatException -> 0x014d }
            goto L_0x0008
        L_0x0073:
            int r1 = r4.indexOf(r6)     // Catch:{ NumberFormatException -> 0x014d }
            if (r1 == r8) goto L_0x008a
            int r2 = r1 + 1
            java.lang.String r2 = r4.substring(r2)     // Catch:{ NumberFormatException -> 0x014d }
            int r2 = a(r2)     // Catch:{ NumberFormatException -> 0x014d }
            r11.i = r2     // Catch:{ NumberFormatException -> 0x014d }
            java.lang.String r4 = r4.substring(r7, r1)     // Catch:{ NumberFormatException -> 0x014d }
        L_0x008a:
            float r1 = defpackage.bfr.b(r4)     // Catch:{ NumberFormatException -> 0x014d }
            r11.h = r1     // Catch:{ NumberFormatException -> 0x014d }
            goto L_0x0008
        L_0x0093:
            int r2 = r4.hashCode()
            r5 = 5
            r6 = 4
            r9 = 3
            switch(r2) {
                case -1364013995: goto L_0x00d0;
                case -1074341483: goto L_0x00c6;
                case 100571: goto L_0x00bc;
                case 3317767: goto L_0x00b2;
                case 108511772: goto L_0x00a8;
                case 109757538: goto L_0x009e;
                default: goto L_0x009d;
            }
        L_0x009d:
            goto L_0x00da
        L_0x009e:
            java.lang.String r2 = "start"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x009d
            goto L_0x00db
        L_0x00a8:
            java.lang.String r2 = "right"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x009d
            r7 = 5
            goto L_0x00db
        L_0x00b2:
            java.lang.String r2 = "left"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x009d
            r7 = 1
            goto L_0x00db
        L_0x00bc:
            java.lang.String r2 = "end"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x009d
            r7 = 4
            goto L_0x00db
        L_0x00c6:
            java.lang.String r2 = "middle"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x009d
            r7 = 3
            goto L_0x00db
        L_0x00d0:
            java.lang.String r2 = "center"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x009d
            r7 = 2
            goto L_0x00db
        L_0x00da:
            r7 = -1
        L_0x00db:
            if (r7 == 0) goto L_0x010f
            if (r7 == r1) goto L_0x010b
            if (r7 == r3) goto L_0x0108
            if (r7 == r9) goto L_0x0108
            if (r7 == r6) goto L_0x0104
            if (r7 == r5) goto L_0x0101
            java.lang.String r1 = "Invalid alignment value: "
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ NumberFormatException -> 0x014d }
            int r4 = r2.length()     // Catch:{ NumberFormatException -> 0x014d }
            if (r4 != 0) goto L_0x00f9
            java.lang.String r2 = new java.lang.String     // Catch:{ NumberFormatException -> 0x014d }
            r2.<init>(r1)     // Catch:{ NumberFormatException -> 0x014d }
            goto L_0x00fd
        L_0x00f9:
            java.lang.String r2 = r1.concat(r2)     // Catch:{ NumberFormatException -> 0x014d }
        L_0x00fd:
            android.util.Log.w(r0, r2)     // Catch:{ NumberFormatException -> 0x014d }
            goto L_0x0111
        L_0x0101:
            r3 = 5
            goto L_0x0111
        L_0x0104:
            r3 = 3
            goto L_0x0111
        L_0x0108:
            goto L_0x0111
        L_0x010b:
            r3 = 4
            goto L_0x0111
        L_0x010f:
            r3 = 1
        L_0x0111:
            r11.d = r3     // Catch:{ NumberFormatException -> 0x014d }
            goto L_0x0008
        L_0x0115:
            int r2 = r4.indexOf(r6)     // Catch:{ NumberFormatException -> 0x014d }
            if (r2 == r8) goto L_0x012c
            int r3 = r2 + 1
            java.lang.String r3 = r4.substring(r3)     // Catch:{ NumberFormatException -> 0x014d }
            int r3 = a(r3)     // Catch:{ NumberFormatException -> 0x014d }
            r11.g = r3     // Catch:{ NumberFormatException -> 0x014d }
            java.lang.String r4 = r4.substring(r7, r2)     // Catch:{ NumberFormatException -> 0x014d }
        L_0x012c:
            java.lang.String r2 = "%"
            boolean r2 = r4.endsWith(r2)     // Catch:{ NumberFormatException -> 0x014d }
            if (r2 == 0) goto L_0x013e
            float r1 = defpackage.bfr.b(r4)     // Catch:{ NumberFormatException -> 0x014d }
            r11.e = r1     // Catch:{ NumberFormatException -> 0x014d }
            r11.f = r7     // Catch:{ NumberFormatException -> 0x014d }
            goto L_0x0008
        L_0x013e:
            int r2 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x014d }
            if (r2 >= 0) goto L_0x0146
            int r2 = r2 + -1
        L_0x0146:
            float r2 = (float) r2     // Catch:{ NumberFormatException -> 0x014d }
            r11.e = r2     // Catch:{ NumberFormatException -> 0x014d }
            r11.f = r1     // Catch:{ NumberFormatException -> 0x014d }
            goto L_0x0008
        L_0x014d:
            r1 = move-exception
            java.lang.String r1 = r10.group()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Skipping bad cue setting: "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0164
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x0168
        L_0x0164:
            java.lang.String r1 = r2.concat(r1)
        L_0x0168:
            android.util.Log.w(r0, r1)
            goto L_0x0008
        L_0x016d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfp.a(java.lang.String, bfl):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0119 A[LOOP:2: B:69:0x0119->B:72:0x012e, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(java.lang.String r17, java.lang.String r18, defpackage.bfl r19, java.util.List r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r20
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            r7 = 0
        L_0x0017:
            int r8 = r18.length()
            if (r7 < r8) goto L_0x003e
        L_0x001d:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x002d
            java.lang.Object r1 = r4.pop()
            bfn r1 = (defpackage.bfn) r1
            a(r0, r1, r3, r2, r5)
            goto L_0x001d
        L_0x002d:
            bfn r1 = new bfn
            java.lang.String[] r4 = new java.lang.String[r6]
            java.lang.String r7 = ""
            r1.<init>(r7, r6, r7, r4)
            a(r0, r1, r3, r2, r5)
            r8 = r19
            r8.c = r3
            return
        L_0x003e:
            r8 = r19
            char r9 = r1.charAt(r7)
            r10 = 62
            r11 = 60
            r12 = 38
            r15 = -1
            r13 = 1
            if (r9 == r12) goto L_0x014c
            if (r9 == r11) goto L_0x0056
            r3.append(r9)
            int r7 = r7 + 1
            goto L_0x0017
        L_0x0056:
            int r9 = r7 + 1
            int r11 = r18.length()
            if (r9 >= r11) goto L_0x0148
            char r11 = r1.charAt(r9)
            int r9 = r1.indexOf(r10, r9)
            if (r9 == r15) goto L_0x006b
            int r9 = r9 + 1
            goto L_0x006f
        L_0x006b:
            int r9 = r18.length()
        L_0x006f:
            int r10 = r9 + -2
            char r12 = r1.charAt(r10)
            r15 = 47
            if (r11 != r15) goto L_0x007d
            r16 = 2
            goto L_0x007f
        L_0x007d:
            r16 = 1
        L_0x007f:
            int r7 = r7 + r16
            if (r12 == r15) goto L_0x0085
            int r10 = r9 + -1
        L_0x0085:
            java.lang.String r7 = r1.substring(r7, r10)
            java.lang.String r10 = r7.trim()
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0143
            java.lang.String r10 = r7.trim()
            boolean r16 = r10.isEmpty()
            r16 = r16 ^ 1
            defpackage.bks.a(r16)
            java.lang.String r15 = "[ \\.]"
            java.lang.String[] r10 = defpackage.blm.b(r10, r15)
            r10 = r10[r6]
            int r15 = r10.hashCode()
            r6 = 98
            r14 = 4
            if (r15 == r6) goto L_0x00fa
            r6 = 99
            if (r15 == r6) goto L_0x00f0
            r6 = 105(0x69, float:1.47E-43)
            if (r15 == r6) goto L_0x00e6
            r6 = 3314158(0x3291ee, float:4.644125E-39)
            if (r15 == r6) goto L_0x00db
            r6 = 117(0x75, float:1.64E-43)
            if (r15 == r6) goto L_0x00d1
            r6 = 118(0x76, float:1.65E-43)
            if (r15 == r6) goto L_0x00c7
        L_0x00c6:
            goto L_0x0104
        L_0x00c7:
            java.lang.String r6 = "v"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x00c6
            r6 = 5
            goto L_0x0105
        L_0x00d1:
            java.lang.String r6 = "u"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x00c6
            r6 = 4
            goto L_0x0105
        L_0x00db:
            java.lang.String r6 = "lang"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x00c6
            r6 = 3
            goto L_0x0105
        L_0x00e6:
            java.lang.String r6 = "i"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x00c6
            r6 = 2
            goto L_0x0105
        L_0x00f0:
            java.lang.String r6 = "c"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x00c6
            r6 = 1
            goto L_0x0105
        L_0x00fa:
            java.lang.String r6 = "b"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x00c6
            r6 = 0
            goto L_0x0105
        L_0x0104:
            r6 = -1
        L_0x0105:
            if (r6 == 0) goto L_0x0115
            if (r6 == r13) goto L_0x0115
            r13 = 2
            if (r6 == r13) goto L_0x0115
            r13 = 3
            if (r6 == r13) goto L_0x0115
            if (r6 == r14) goto L_0x0115
            r13 = 5
            if (r6 == r13) goto L_0x0115
            goto L_0x0143
        L_0x0115:
            r6 = 47
            if (r11 != r6) goto L_0x0131
        L_0x0119:
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L_0x0143
            java.lang.Object r6 = r4.pop()
            bfn r6 = (defpackage.bfn) r6
            a(r0, r6, r3, r2, r5)
            java.lang.String r6 = r6.a
            boolean r6 = r6.equals(r10)
            if (r6 == 0) goto L_0x0119
            goto L_0x0143
        L_0x0131:
            r6 = 47
            if (r12 == r6) goto L_0x0143
            int r6 = r3.length()
            bfn r6 = defpackage.bfn.a(r7, r6)
            r4.push(r6)
            goto L_0x0144
        L_0x0143:
        L_0x0144:
            r7 = r9
            r6 = 0
            goto L_0x0017
        L_0x0148:
            r7 = r9
            r6 = 0
            goto L_0x0017
        L_0x014c:
            int r7 = r7 + 1
            r6 = 59
            int r6 = r1.indexOf(r6, r7)
            r14 = 32
            int r15 = r1.indexOf(r14, r7)
            r11 = -1
            if (r6 != r11) goto L_0x0160
            r6 = r15
            goto L_0x0167
        L_0x0160:
            if (r15 == r11) goto L_0x0167
            int r6 = java.lang.Math.min(r6, r15)
        L_0x0167:
            if (r6 != r11) goto L_0x0170
            r3.append(r9)
            r6 = 0
            goto L_0x0017
        L_0x0170:
            java.lang.String r7 = r1.substring(r7, r6)
            int r9 = r7.hashCode()
            r11 = 3309(0xced, float:4.637E-42)
            if (r9 == r11) goto L_0x01aa
            r11 = 3464(0xd88, float:4.854E-42)
            if (r9 == r11) goto L_0x01a0
            r11 = 96708(0x179c4, float:1.35517E-40)
            if (r9 == r11) goto L_0x0196
            r11 = 3374865(0x337f11, float:4.729193E-39)
            if (r9 == r11) goto L_0x018b
        L_0x018a:
            goto L_0x01b4
        L_0x018b:
            java.lang.String r9 = "nbsp"
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L_0x018a
            r9 = 2
            goto L_0x01b5
        L_0x0196:
            java.lang.String r9 = "amp"
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L_0x018a
            r9 = 3
            goto L_0x01b5
        L_0x01a0:
            java.lang.String r9 = "lt"
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L_0x018a
            r9 = 0
            goto L_0x01b5
        L_0x01aa:
            java.lang.String r9 = "gt"
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L_0x018a
            r9 = 1
            goto L_0x01b5
        L_0x01b4:
            r9 = -1
        L_0x01b5:
            if (r9 == 0) goto L_0x01f4
            if (r9 == r13) goto L_0x01ef
            r11 = 2
            if (r9 == r11) goto L_0x01ea
            r10 = 3
            if (r9 == r10) goto L_0x01e5
            java.lang.String r9 = java.lang.String.valueOf(r7)
            int r9 = r9.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r9 = r9 + 33
            r10.<init>(r9)
            java.lang.String r9 = "ignoring unsupported entity: '&"
            r10.append(r9)
            r10.append(r7)
            java.lang.String r7 = ";'"
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            java.lang.String r9 = "WebvttCueParser"
            android.util.Log.w(r9, r7)
            goto L_0x01fa
        L_0x01e5:
            r3.append(r12)
            goto L_0x01fa
        L_0x01ea:
            r3.append(r14)
            goto L_0x01fa
        L_0x01ef:
            r3.append(r10)
            goto L_0x01fa
        L_0x01f4:
            r7 = 60
            r3.append(r7)
        L_0x01fa:
            if (r6 != r15) goto L_0x0201
            java.lang.String r7 = " "
            r3.append(r7)
        L_0x0201:
            int r7 = r6 + 1
            r6 = 0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfp.a(java.lang.String, java.lang.String, bfl, java.util.List):void");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private static int a(String str) {
        char c2;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 100571:
                if (str.equals("end")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 109757538:
                if (str.equals("start")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            return 0;
        }
        if (c2 == 1 || c2 == 2) {
            return 1;
        }
        if (c2 == 3) {
            return 2;
        }
        String valueOf = String.valueOf(str);
        Log.w("WebvttCueParser", valueOf.length() == 0 ? new String("Invalid anchor value: ") : "Invalid anchor value: ".concat(valueOf));
        return Integer.MIN_VALUE;
    }
}
