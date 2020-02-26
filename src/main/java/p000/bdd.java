package p000;

import android.util.Base64;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: bdd */
/* compiled from: PG */
final class bdd extends bdb {

    /* renamed from: a */
    private boolean f3379a;

    /* renamed from: b */
    private UUID f3380b;

    /* renamed from: c */
    private byte[] f3381c;

    public bdd(bdb bdb, String str) {
        super(bdb, str, "Protection");
    }

    /* renamed from: a */
    public final Object mo1771a() {
        UUID uuid = this.f3380b;
        byte[] a = bty.m4185a(uuid, this.f3381c);
        byte[] bArr = this.f3381c;
        aqp[] aqpArr = new aqp[1];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i += 2) {
            sb.append((char) bArr[i]);
        }
        String sb2 = sb.toString();
        byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
        m2879a(decode, 0, 3);
        m2879a(decode, 1, 2);
        m2879a(decode, 4, 5);
        m2879a(decode, 6, 7);
        aqpArr[0] = new aqp(true, null, 8, decode, 0, 0, null);
        return new bcy(uuid, a, aqpArr);
    }

    /* renamed from: b */
    public final boolean mo1777b(String str) {
        return "ProtectionHeader".equals(str);
    }

    /* renamed from: d */
    public final void mo1779d(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f3379a = false;
        }
    }

    /* renamed from: b */
    public final void mo1776b(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f3379a = true;
            String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
            if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
            }
            this.f3380b = UUID.fromString(attributeValue);
        }
    }

    /* renamed from: c */
    public final void mo1778c(XmlPullParser xmlPullParser) {
        if (this.f3379a) {
            this.f3381c = Base64.decode(xmlPullParser.getText(), 0);
        }
    }

    /* renamed from: a */
    private static void m2879a(byte[] bArr, int i, int i2) {
        byte b = bArr[i];
        bArr[i] = bArr[i2];
        bArr[i2] = b;
    }
}
