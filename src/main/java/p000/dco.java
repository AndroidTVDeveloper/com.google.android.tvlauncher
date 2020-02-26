package p000;

import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: dco */
/* compiled from: PG */
final class dco {

    /* renamed from: a */
    private final InputStream f8292a;

    /* renamed from: b */
    private final dcn f8293b;

    /* renamed from: c */
    private final boolean f8294c;

    /* renamed from: d */
    private final boolean f8295d;

    /* renamed from: e */
    private int f8296e = 0;

    public dco(InputStream inputStream, dcn dcn, boolean z, boolean z2) {
        this.f8292a = inputStream;
        this.f8293b = dcn;
        this.f8294c = z;
        this.f8295d = z2;
    }

    /* renamed from: a */
    private static Boolean m6162a(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return null;
        }
        String trim = attributeValue.trim();
        if (trim.equalsIgnoreCase("true")) {
            return true;
        }
        if (trim.equalsIgnoreCase("false")) {
            return false;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(trim).length() + 47 + str.length());
        sb.append("Invalid boolean value ");
        sb.append(trim);
        sb.append(" specified for attribute ");
        sb.append(str);
        throw new XmlPullParserException(sb.toString());
    }

    /* renamed from: c */
    private static boolean m6164c(XmlPullParser xmlPullParser, String str) {
        Boolean a = m6162a(xmlPullParser, str);
        if (a == null) {
            return true;
        }
        return a.booleanValue();
    }

    /* renamed from: b */
    private static int m6163b(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            throw new XmlPullParserException(str.length() == 0 ? new String("missing value for attribute ") : "missing value for attribute ".concat(str));
        }
        try {
            return Integer.parseInt(attributeValue.trim());
        } catch (NumberFormatException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(attributeValue.length() + 38 + str.length() + String.valueOf(valueOf).length());
            sb.append("wrong attribute value ");
            sb.append(attributeValue);
            sb.append(" for attribute ");
            sb.append(str);
            sb.append("\n");
            sb.append(valueOf);
            throw new XmlPullParserException(sb.toString());
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcn.a(int, boolean):void
     arg types: [int, int]
     candidates:
      dcn.a(dah, boolean):void
      dcn.a(dch, boolean):void
      dcn.a(java.lang.String, int):void
      dcn.a(java.lang.String, boolean):void
      dcn.a(java.lang.String, java.lang.String):boolean
      dcn.a(int, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcn.a(dch, boolean):void
     arg types: [dch, int]
     candidates:
      dcn.a(int, boolean):void
      dcn.a(dah, boolean):void
      dcn.a(java.lang.String, int):void
      dcn.a(java.lang.String, boolean):void
      dcn.a(java.lang.String, java.lang.String):boolean
      dcn.a(dch, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcn.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      dcn.a(int, boolean):void
      dcn.a(dah, boolean):void
      dcn.a(dch, boolean):void
      dcn.a(java.lang.String, int):void
      dcn.a(java.lang.String, java.lang.String):boolean
      dcn.a(java.lang.String, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcn.a(dah, boolean):void
     arg types: [dah, int]
     candidates:
      dcn.a(int, boolean):void
      dcn.a(dch, boolean):void
      dcn.a(java.lang.String, int):void
      dcn.a(java.lang.String, boolean):void
      dcn.a(java.lang.String, java.lang.String):boolean
      dcn.a(dah, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcn.a(java.lang.String, java.lang.String, boolean):boolean
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      dcn.a(java.util.Collection, java.lang.String, android.content.SharedPreferences$Editor):void
      dcn.a(java.lang.String, java.lang.String, boolean):boolean */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x06e9, code lost:
        continue;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo4127a() {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r2 = "partner-all-apps-out-of-box-order"
            java.lang.String r3 = "inputs"
            java.lang.String r4 = "partner-games-out-of-box-order"
            java.lang.String r5 = "OemConfigXmlParser"
            java.util.ArrayDeque r6 = new java.util.ArrayDeque
            r6.<init>()
            org.xmlpull.v1.XmlPullParserFactory r8 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            org.xmlpull.v1.XmlPullParser r8 = r8.newPullParser()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.io.InputStream r10 = r1.f8292a     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r9.<init>(r10)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r8.setInput(r9)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            int r9 = r8.getEventType()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x0025:
            r10 = 1
            if (r9 == r10) goto L_0x06f1
            r11 = 3
            r12 = 2
            if (r9 == r12) goto L_0x005c
            if (r9 == r11) goto L_0x0032
            r17 = r6
            goto L_0x06e9
        L_0x0032:
            boolean r9 = r6.isEmpty()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r9 != 0) goto L_0x0054
            java.lang.Object r9 = r6.pop()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r10 = r8.getName()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r9 = android.text.TextUtils.equals(r9, r10)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r9 == 0) goto L_0x004c
            r17 = r6
            goto L_0x06e9
        L_0x004c:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r3 = "start and end tags don't match"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            throw r2     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x0054:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r3 = "end tag without start tag"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            throw r2     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x005c:
            boolean r9 = r6.isEmpty()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r9 != 0) goto L_0x0069
            java.lang.Object r9 = r6.peek()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x006b
        L_0x0069:
            r9 = 0
        L_0x006b:
            java.lang.String r14 = r8.getName()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r6.push(r14)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r14 = r8.getName()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            int r15 = r14.hashCode()
            java.lang.String r7 = "inputs-configuration"
            java.lang.String r11 = "home-screen-inputs-ordering"
            r16 = -1
            switch(r15) {
                case -2135709027: goto L_0x010d;
                case -1923341390: goto L_0x0102;
                case -1768284787: goto L_0x00f7;
                case -1630898555: goto L_0x00ef;
                case -1107278855: goto L_0x00e5;
                case -1091921801: goto L_0x00da;
                case -1042206617: goto L_0x00d0;
                case -615296567: goto L_0x00c5;
                case -470197540: goto L_0x00bb;
                case -371424527: goto L_0x00b1;
                case -119178222: goto L_0x00a8;
                case 96801: goto L_0x009d;
                case 1340516189: goto L_0x0092;
                case 1608054254: goto L_0x0085;
                default: goto L_0x0083;
            }
        L_0x0083:
            goto L_0x0118
        L_0x0085:
            java.lang.String r15 = "content-provider-configuration"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0083
            r14 = 13
            goto L_0x0119
        L_0x0092:
            java.lang.String r15 = "input-type"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0083
            r14 = 6
            goto L_0x0119
        L_0x009d:
            java.lang.String r15 = "app"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0083
            r14 = 7
            goto L_0x0119
        L_0x00a8:
            boolean r14 = r14.equals(r7)
            if (r14 == 0) goto L_0x0083
            r14 = 1
            goto L_0x0119
        L_0x00b1:
            java.lang.String r15 = "program-menu-configuration"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0083
            r14 = 2
            goto L_0x0119
        L_0x00bb:
            java.lang.String r15 = "home-background"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0083
            r14 = 4
            goto L_0x0119
        L_0x00c5:
            java.lang.String r15 = "headsup-notifications"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0083
            r14 = 9
            goto L_0x0119
        L_0x00d0:
            java.lang.String r15 = "watch-next-channel"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0083
            r14 = 3
            goto L_0x0119
        L_0x00da:
            java.lang.String r15 = "apps-view-layout"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0083
            r14 = 10
            goto L_0x0119
        L_0x00e5:
            java.lang.String r15 = "partner-search-icon"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0083
            r14 = 0
            goto L_0x0119
        L_0x00ef:
            boolean r14 = r14.equals(r11)
            if (r14 == 0) goto L_0x0083
            r14 = 5
            goto L_0x0119
        L_0x00f7:
            java.lang.String r15 = "live-tv-app-channel"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0083
            r14 = 12
            goto L_0x0119
        L_0x0102:
            java.lang.String r15 = "package-name"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0083
            r14 = 8
            goto L_0x0119
        L_0x010d:
            java.lang.String r15 = "launch-after-boot"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0083
            r14 = 11
            goto L_0x0119
        L_0x0118:
            r14 = -1
        L_0x0119:
            java.lang.String r15 = "can_hide"
            java.lang.String r12 = "can_move"
            java.lang.String r10 = "background_color"
            java.lang.String r13 = "system_channel_key"
            r17 = r6
            java.lang.String r6 = "icon_uri"
            r18 = r6
            java.lang.String r6 = "package_name"
            switch(r14) {
                case 0: goto L_0x069f;
                case 1: goto L_0x05c4;
                case 2: goto L_0x05a2;
                case 3: goto L_0x0580;
                case 4: goto L_0x0573;
                case 5: goto L_0x0562;
                case 6: goto L_0x053b;
                case 7: goto L_0x03bc;
                case 8: goto L_0x0268;
                case 9: goto L_0x01f6;
                case 10: goto L_0x01b5;
                case 11: goto L_0x017f;
                case 12: goto L_0x0146;
                case 13: goto L_0x012e;
                default: goto L_0x012c;
            }
        L_0x012c:
            goto L_0x06e9
        L_0x012e:
            java.lang.String r6 = "apprecs_package"
            r7 = 0
            java.lang.String r6 = r8.getAttributeValue(r7, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            dcn r7 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r7.f8240E = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r6 = "widget_package"
            r7 = 0
            java.lang.String r6 = r8.getAttributeValue(r7, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            dcn r7 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r7.f8241F = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x0146:
            r7 = 0
            java.lang.String r6 = r8.getAttributeValue(r7, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r7 != 0) goto L_0x0177
            dcn r7 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            dai r7 = r7.f8237B     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r7 != 0) goto L_0x0170
            r7 = 0
            java.lang.String r7 = r8.getAttributeValue(r7, r13)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r9 = "out_of_box_position"
            int r9 = m6163b(r8, r9)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            dcn r10 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r11 = 1
            r10.mo4126d(r6, r7, r11)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            dcn r6 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r6.mo4111a(r9, r11)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x0170:
            java.lang.String r6 = "There should be only one tag live-tv-app-channel"
            android.util.Log.e(r5, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x0177:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r3 = "package_name and out_of_box_position are required for live-tv-app-channel"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            throw r2     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x017f:
            r7 = 0
            java.lang.String r6 = r8.getAttributeValue(r7, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x01ad
            dcn r7 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r7.f8281p = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r6 = "force_launch"
            java.lang.Boolean r6 = m6162a(r8, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x019b
            dcn r7 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r6 = r6.booleanValue()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r7.f8280o = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x019b:
            java.lang.String r6 = "use_main_intent"
            java.lang.Boolean r6 = m6162a(r8, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x06e9
            dcn r7 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r6 = r6.booleanValue()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r7.f8282q = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x01ad:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r3 = "missing package_name attribute in launch-after-boot"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            throw r2     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x01b5:
            java.lang.String r6 = " for attribute rows_order in apps-view-layout"
            java.lang.String r7 = "rows_order"
            r9 = 0
            java.lang.String r7 = r8.getAttributeValue(r9, r7)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r7 == 0) goto L_0x01ee
            dch r9 = p000.dch.m6120a(r7)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r9 == 0) goto L_0x01ce
            dcn r6 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r7 = 1
            r6.mo4113a(r9, r7)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x01ce:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            int r3 = r7.length()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            int r3 = r3 + 59
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r3 = "invalid value "
            r4.append(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r4.append(r7)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r4.append(r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r3 = r4.toString()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            throw r2     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x01ee:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r3 = "missing rows_order attribute in apps-view-layout"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            throw r2     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x01f6:
            java.lang.String r6 = "location"
            r7 = 0
            java.lang.String r6 = r8.getAttributeValue(r7, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 != 0) goto L_0x0200
            goto L_0x0204
        L_0x0200:
            dcn r7 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r7.f8239D = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x0204:
            java.lang.String r6 = "font"
            r7 = 0
            java.lang.String r6 = r8.getAttributeValue(r7, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 != 0) goto L_0x020e
            goto L_0x0212
        L_0x020e:
            dcn r7 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r7.f8291z = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x0212:
            java.lang.String r6 = "text_color"
            r7 = 0
            java.lang.String r6 = r8.getAttributeValue(r7, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x023c
            int r7 = android.graphics.Color.parseColor(r6)     // Catch:{ IllegalArgumentException -> 0x0225 }
            dcn r9 = r1.f8293b     // Catch:{ IllegalArgumentException -> 0x0225 }
            r9.mo4120b(r7)     // Catch:{ IllegalArgumentException -> 0x0225 }
            goto L_0x023c
        L_0x0225:
            r0 = move-exception
            r7 = r0
            java.lang.String r9 = "Cannot decode notification text color "
            int r11 = r6.length()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r11 != 0) goto L_0x0235
            java.lang.String r6 = new java.lang.String     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r6.<init>(r9)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x0239
        L_0x0235:
            java.lang.String r6 = r9.concat(r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x0239:
            android.util.Log.e(r5, r6, r7)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x023c:
            r6 = 0
            java.lang.String r6 = r8.getAttributeValue(r6, r10)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x06e9
            dcn r7 = r1.f8293b     // Catch:{ IllegalArgumentException -> 0x024f }
            int r9 = android.graphics.Color.parseColor(r6)     // Catch:{ IllegalArgumentException -> 0x024f }
            r7.mo4123c(r9)     // Catch:{ IllegalArgumentException -> 0x024f }
            goto L_0x06e9
        L_0x024f:
            r0 = move-exception
            r7 = r0
            java.lang.String r9 = "Cannot decode notification background color "
            int r10 = r6.length()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r10 != 0) goto L_0x025f
            java.lang.String r6 = new java.lang.String     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r6.<init>(r9)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x0263
        L_0x025f:
            java.lang.String r6 = r9.concat(r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x0263:
            android.util.Log.e(r5, r6, r7)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x0268:
            java.lang.String r6 = " in the partner-channels-out-of-box-order."
            java.lang.String r7 = " and can_hide="
            int r10 = r9.hashCode()
            switch(r10) {
                case 51246093: goto L_0x0293;
                case 1377815793: goto L_0x0289;
                case 1815804758: goto L_0x027f;
                case 2031280428: goto L_0x0274;
                default: goto L_0x0273;
            }
        L_0x0273:
            goto L_0x029d
        L_0x0274:
            java.lang.String r10 = "configure-channels-app-order"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0273
            r9 = 2
            goto L_0x029e
        L_0x027f:
            java.lang.String r10 = "hide-uninstallation-user-action-apps"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0273
            r9 = 3
            goto L_0x029e
        L_0x0289:
            java.lang.String r10 = "partner-package-notification-whitelist"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0273
            r9 = 1
            goto L_0x029e
        L_0x0293:
            java.lang.String r10 = "partner-channels-out-of-box-order"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0273
            r9 = 0
            goto L_0x029e
        L_0x029d:
            r9 = -1
        L_0x029e:
            if (r9 == 0) goto L_0x0318
            r10 = 1
            if (r9 == r10) goto L_0x02fc
            r6 = 2
            if (r9 == r6) goto L_0x02df
            r6 = 3
            if (r9 == r6) goto L_0x02ae
            r8.next()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x02ae:
            r8.next()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r6 = r1.f8295d     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x06e9
            dcn r6 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.util.List r6 = r6.f8290y     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r6 = r6.isEmpty()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x02d8
            java.lang.String r6 = r8.getText()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r7 != 0) goto L_0x02d0
            dcn r7 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r7.mo4124c(r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x02d0:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r3 = "Empty package name for hide-uninstallation-user-action-apps"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            throw r2     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x02d8:
            java.lang.String r6 = "Not accepting multiple packages in hide-uninstallation-user-action-apps"
            android.util.Log.e(r5, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x02df:
            r8.next()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r6 = r8.getText()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r7 != 0) goto L_0x02f4
            dcn r7 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r9 = 1
            r7.mo4116a(r6, r9)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x02f4:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r3 = "Empty package name for configure-channels-app-order"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            throw r2     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x02fc:
            r8.next()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r6 = r8.getText()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r7 != 0) goto L_0x0310
            dcn r7 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r7.mo4121b(r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x0310:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r3 = "Empty package name for partner-package-notification-whitelist"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            throw r2     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x0318:
            r9 = 0
            java.lang.String r10 = r8.getAttributeValue(r9, r13)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r11 = "type"
            java.lang.String r9 = r8.getAttributeValue(r9, r11)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r11 = m6164c(r8, r12)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r12 = m6164c(r8, r15)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r8.next()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r13 = r8.getText()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r14 = android.text.TextUtils.isEmpty(r13)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r14 != 0) goto L_0x03b4
            dah r14 = new dah     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r14.<init>()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r14.f8043a = r13     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r14.f8044b = r10     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r15 = "sponsored"
            boolean r9 = r15.equalsIgnoreCase(r9)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r9 == 0) goto L_0x0379
            boolean r9 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r9 != 0) goto L_0x0355
            r6 = 1
            r14.f8046d = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x0379
        L_0x0355:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r3 = java.lang.String.valueOf(r13)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            int r3 = r3.length()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            int r3 = r3 + 79
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r3 = "Empty system_channel_key for package "
            r4.append(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r4.append(r13)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r4.append(r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r3 = r4.toString()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            throw r2     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x0379:
            boolean r6 = r14.f8046d     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 != 0) goto L_0x0382
            boolean r6 = r1.f8294c     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 != 0) goto L_0x0382
            goto L_0x03ac
        L_0x0382:
            r6 = r12 ^ r11
            if (r6 == 0) goto L_0x03a8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r9 = 113(0x71, float:1.58E-43)
            r6.<init>(r9)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r9 = "Combination of can_move="
            r6.append(r9)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r6.append(r11)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r6.append(r7)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r6.append(r12)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r7 = " is not supported. Only both \"true\" or both \"false\" are supported"
            r6.append(r7)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            android.util.Log.e(r5, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x03ac
        L_0x03a8:
            r14.f8048f = r11     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r14.f8049g = r12     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x03ac:
            dcn r6 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r7 = 1
            r6.mo4112a(r14, r7)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x03b4:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r3 = "Empty package name for partner-channels-out-of-box-order"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            throw r2     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x03bc:
            boolean r7 = r4.equals(r9)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            dcp r10 = new dcp     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r10.<init>()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r11 = "name"
            r13 = 0
            java.lang.String r11 = r8.getAttributeValue(r13, r11)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r10.f8173a = r11     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r6 = r8.getAttributeValue(r13, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r10.f8174b = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r6 = "banner_uri"
            java.lang.String r6 = r8.getAttributeValue(r13, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r10.f8175c = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r6 = "data_uri"
            java.lang.String r6 = r8.getAttributeValue(r13, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r10.f8176d = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r10.f8180h = r7     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r6 = "is_virtual_app"
            java.lang.Boolean r6 = m6162a(r8, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 != 0) goto L_0x03ef
            goto L_0x03f5
        L_0x03ef:
            boolean r6 = r6.booleanValue()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r10.f8181i = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x03f5:
            java.lang.Boolean r6 = m6162a(r8, r12)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.Boolean r7 = m6162a(r8, r15)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x0409
            boolean r6 = r6.booleanValue()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 != 0) goto L_0x0408
            r6 = 0
            goto L_0x040a
        L_0x0408:
        L_0x0409:
            r6 = 1
        L_0x040a:
            r10.f8297k = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r7 == 0) goto L_0x0417
            boolean r6 = r7.booleanValue()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 != 0) goto L_0x0416
            r6 = 0
            goto L_0x0418
        L_0x0416:
        L_0x0417:
            r6 = 1
        L_0x0418:
            r10.f8298l = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            dcq r6 = new dcq     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r6.<init>(r10)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r7 = r2.equals(r9)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r7 != 0) goto L_0x042b
            boolean r7 = r4.equals(r9)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r7 == 0) goto L_0x045a
        L_0x042b:
            dcn r7 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r10 = r7.f8242G     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r10 != 0) goto L_0x045a
            boolean r10 = r6.f8188f     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r10 == 0) goto L_0x045a
            java.lang.String r10 = r6.f8183a     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r10 != 0) goto L_0x045a
            java.lang.String r10 = r6.f8184b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r10 != 0) goto L_0x045a
            java.lang.String r10 = r6.f8185c     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r10 != 0) goto L_0x045a
            java.lang.String r10 = r6.f8186d     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r10 != 0) goto L_0x045a
            java.util.List r7 = r7.f8251P     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r7.add(r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x045a:
            java.lang.String r7 = r6.f8183a     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r10 = r6.f8193k     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            int r11 = r9.hashCode()
            switch(r11) {
                case -1722951491: goto L_0x0481;
                case -874475868: goto L_0x0477;
                case 784148646: goto L_0x046f;
                case 2042236543: goto L_0x0466;
                default: goto L_0x0465;
            }
        L_0x0465:
            goto L_0x048b
        L_0x0466:
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0465
            r9 = 1
            goto L_0x048c
        L_0x046f:
            boolean r9 = r9.equals(r4)
            if (r9 == 0) goto L_0x0465
            r9 = 2
            goto L_0x048c
        L_0x0477:
            java.lang.String r11 = "partner-favorite-apps-out-of-box-order"
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L_0x0465
            r9 = 0
            goto L_0x048c
        L_0x0481:
            java.lang.String r11 = "partner-app-channel-quota"
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L_0x0465
            r9 = 3
            goto L_0x048c
        L_0x048b:
            r9 = -1
        L_0x048c:
            if (r9 == 0) goto L_0x04ec
            r11 = 1
            if (r9 == r11) goto L_0x04d0
            r6 = 2
            if (r9 == r6) goto L_0x04b4
            r6 = 3
            if (r9 == r6) goto L_0x0499
            goto L_0x06e9
        L_0x0499:
            java.lang.String r6 = "quota"
            int r6 = m6163b(r8, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r7 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r7 != 0) goto L_0x04ac
            dcn r7 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r7.mo4115a(r10, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x04ac:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r3 = "missing or empty attributes for app in partner-app-channel-quota , package_name and quota are required."
            r2.<init>(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            throw r2     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x04b4:
            boolean r6 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 != 0) goto L_0x04c8
            boolean r6 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 != 0) goto L_0x04c8
            dcn r6 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r9 = 1
            r6.mo4125c(r7, r10, r9)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x04c8:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r3 = "missing or empty attributes for app in partner-games-out-of-box-order , name and package_name are required."
            r2.<init>(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            throw r2     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x04d0:
            boolean r6 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 != 0) goto L_0x04e4
            boolean r6 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 != 0) goto L_0x04e4
            dcn r6 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r9 = 1
            r6.mo4122b(r7, r10, r9)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x04e4:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r3 = "missing or empty attributes for app in partner-all-apps-out-of-box-order , name and package_name are required."
            r2.<init>(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            throw r2     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x04ec:
            boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r9 != 0) goto L_0x0533
            boolean r9 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r9 != 0) goto L_0x0533
            boolean r9 = r6.f8299l     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r9 == 0) goto L_0x04fd
            goto L_0x051b
        L_0x04fd:
            boolean r6 = r6.f8300m     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 != 0) goto L_0x051b
            int r6 = r1.f8296e     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x050c
            java.lang.String r6 = "Cannot add pinned app because it was not in the beginning of the out of box ordering list"
            android.util.Log.e(r5, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x050c:
            dcn r6 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r6 = r6.mo4117a(r7, r10)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 != 0) goto L_0x06e9
            java.lang.String r6 = "Cannot add pinned app due to having too many pinned apps, or non-unique pinned/favorite apps."
            android.util.Log.e(r5, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x051b:
            dcn r6 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r9 = 1
            boolean r6 = r6.mo4118a(r7, r10, r9)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 != 0) goto L_0x052b
            java.lang.String r6 = "Cannot add to favorites because of non-unique pinned/favorite apps."
            android.util.Log.e(r5, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x052b:
            int r6 = r1.f8296e     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r7 = 1
            int r6 = r6 + r7
            r1.f8296e = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x0533:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r3 = "missing or empty attributes for app in partner-favorite-apps-out-of-box-order , name and package_name are required."
            r2.<init>(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            throw r2     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x053b:
            boolean r6 = android.text.TextUtils.equals(r9, r11)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x055a
            r8.next()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r6 = r8.getText()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x0552
            dcn r7 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r7.mo4114a(r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x0552:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r3 = "missing input type"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            throw r2     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x055a:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r3 = "input-type must be inside home-screen-inputs-ordering"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            throw r2     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x0562:
            boolean r6 = android.text.TextUtils.equals(r9, r7)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x056b
            goto L_0x06e9
        L_0x056b:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r3 = "home-screen-inputs-ordering must be inside inputs-configuration"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            throw r2     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x0573:
            dcn r6 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r7 = "uri"
            r9 = 0
            java.lang.String r7 = r8.getAttributeValue(r9, r7)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r6.f8246K = r7     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x0580:
            java.lang.String r6 = "enabled_by_default"
            java.lang.Boolean r6 = m6162a(r8, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x0590
            dcn r7 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r6 = r6.booleanValue()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r7.f8249N = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x0590:
            java.lang.String r6 = "auto_hide_enabled"
            java.lang.Boolean r6 = m6162a(r8, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x06e9
            dcn r7 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r6 = r6.booleanValue()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r7.f8250O = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x05a2:
            java.lang.String r6 = "show_add_to_watch_next"
            java.lang.Boolean r6 = m6162a(r8, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x05b2
            dcn r7 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r6 = r6.booleanValue()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r7.f8247L = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x05b2:
            java.lang.String r6 = "show_remove_program"
            java.lang.Boolean r6 = m6162a(r8, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x06e9
            dcn r7 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r6 = r6.booleanValue()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r7.f8248M = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x05c4:
            java.lang.String r6 = "bundled_tuner_banner"
            java.lang.String r7 = "\" for inputs_panel_label_option"
            r9 = 0
            java.lang.String r6 = r8.getAttributeValue(r9, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x05d7
            dcn r9 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r9.f8269d = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x05d7:
            java.lang.String r6 = "bundled_tuner_title"
            r9 = 0
            java.lang.String r6 = r8.getAttributeValue(r9, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 != 0) goto L_0x05e1
            goto L_0x05e5
        L_0x05e1:
            dcn r9 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r9.f8270e = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x05e5:
            java.lang.String r6 = "disable_disconnected_inputs"
            java.lang.Boolean r6 = m6162a(r8, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x05f5
            dcn r9 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r6 = r6.booleanValue()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r9.f8271f = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x05f5:
            java.lang.String r6 = "disconnected_input_text"
            r9 = 0
            java.lang.String r6 = r8.getAttributeValue(r9, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 != 0) goto L_0x05ff
            goto L_0x0603
        L_0x05ff:
            dcn r9 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r9.f8272g = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x0603:
            java.lang.String r6 = "enable_input_state_icon"
            java.lang.Boolean r6 = m6162a(r8, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x0613
            dcn r9 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r6 = r6.booleanValue()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r9.f8273h = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x0613:
            java.lang.String r6 = "apply_standard_style_to_input_state_icons"
            java.lang.Boolean r6 = m6162a(r8, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x0623
            dcn r9 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r6 = r6.booleanValue()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r9.f8275j = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x0623:
            java.lang.String r6 = "show_inputs"
            java.lang.Boolean r6 = m6162a(r8, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x0633
            dcn r9 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r6 = r6.booleanValue()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r9.f8276k = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x0633:
            java.lang.String r6 = "inputs_panel_label_option"
            r9 = 0
            java.lang.String r6 = r8.getAttributeValue(r9, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x066c
            boolean r9 = r6.equals(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r9 != 0) goto L_0x0668
            java.lang.String r9 = "sources"
            boolean r9 = r6.equals(r9)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r9 != 0) goto L_0x0668
            int r9 = r6.length()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            int r9 = r9 + 46
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r10.<init>(r9)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r9 = "Invalid value \""
            r10.append(r9)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r10.append(r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r10.append(r7)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r6 = r10.toString()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            android.util.Log.e(r5, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r6 = r3
        L_0x0668:
            dcn r7 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r7.f8277l = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x066c:
            java.lang.String r6 = "show_physical_tuners_separately"
            java.lang.Boolean r6 = m6162a(r8, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x067c
            dcn r7 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r6 = r6.booleanValue()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r7.f8278m = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x067c:
            java.lang.String r6 = "use_custom_input_list"
            java.lang.Boolean r6 = m6162a(r8, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x068c
            dcn r7 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r6 = r6.booleanValue()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r7.f8279n = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x068c:
            r6 = r18
            r7 = 0
            java.lang.String r6 = r8.getAttributeValue(r7, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x06e9
            dcn r7 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r7.f8274i = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x069f:
            r6 = r18
            r7 = 0
            java.lang.String r6 = r8.getAttributeValue(r7, r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r6 == 0) goto L_0x06e1
            dcn r7 = r1.f8293b     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r7.f8260a = r6     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r6 = 0
            java.lang.String r6 = r8.getAttributeValue(r6, r10)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r7 != 0) goto L_0x06e9
            int r7 = android.graphics.Color.parseColor(r6)     // Catch:{ IllegalArgumentException -> 0x06c5 }
            dcn r9 = r1.f8293b     // Catch:{ IllegalArgumentException -> 0x06c5 }
            r9.mo4110a(r7)     // Catch:{ IllegalArgumentException -> 0x06c5 }
            goto L_0x06e9
        L_0x06c5:
            r0 = move-exception
            r7 = r0
            java.lang.String r9 = "Cannot decode search orb focused color "
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            int r10 = r6.length()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r10 != 0) goto L_0x06d9
            java.lang.String r6 = new java.lang.String     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r6.<init>(r9)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06dd
        L_0x06d9:
            java.lang.String r6 = r9.concat(r6)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x06dd:
            android.util.Log.e(r5, r6, r7)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            goto L_0x06e9
        L_0x06e1:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r3 = "missing icon_uri attribute in partner-search-icon"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            throw r2     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x06e9:
            int r9 = r8.next()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            r6 = r17
            goto L_0x0025
        L_0x06f1:
            r17 = r6
            boolean r2 = r17.isEmpty()     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            if (r2 == 0) goto L_0x06fb
            r2 = 1
            return r2
        L_0x06fb:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            java.lang.String r3 = "missing end tag"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
            throw r2     // Catch:{ IOException -> 0x0705, XmlPullParserException -> 0x0703 }
        L_0x0703:
            r0 = move-exception
            goto L_0x0706
        L_0x0705:
            r0 = move-exception
        L_0x0706:
            r2 = r0
            java.lang.String r3 = "Error parsing configuration file"
            android.util.Log.e(r5, r3, r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dco.mo4127a():boolean");
    }
}
