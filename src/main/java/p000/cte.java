package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: cte */
/* compiled from: PG */
public final class cte {

    /* renamed from: a */
    public final Context f7339a;

    /* renamed from: b */
    public Resources f7340b;

    /* renamed from: c */
    public String f7341c;

    public cte(Context context) {
        this.f7339a = context;
    }

    /* renamed from: a */
    public static void m5670a(int i, int i2, String str) {
        if (i != i2) {
            throw new XmlPullParserException(str);
        }
    }

    /* renamed from: a */
    public static void m5671a(String str, String str2, String str3) {
        if (!str2.equals(str)) {
            throw new XmlPullParserException(str3);
        }
    }

    /* renamed from: a */
    public final void mo3732a(String str) {
        if (!"1".equals(this.f7341c)) {
            throw new XmlPullParserException(str);
        }
    }

    /* renamed from: a */
    public final String mo3731a(XmlResourceParser xmlResourceParser, int i) {
        int attributeResourceValue = xmlResourceParser.getAttributeResourceValue(i, 0);
        if (attributeResourceValue != 0) {
            return this.f7340b.getString(attributeResourceValue);
        }
        return xmlResourceParser.getAttributeValue(i);
    }
}
