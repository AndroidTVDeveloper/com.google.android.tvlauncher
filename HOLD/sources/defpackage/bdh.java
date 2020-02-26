package defpackage;

import android.net.Uri;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: bdh  reason: default package */
/* compiled from: PG */
public final class bdh implements biz {
    private final XmlPullParserFactory a;

    public bdh() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final bda a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(inputStream, null);
            return (bda) new bdf(uri.toString()).a(newPullParser);
        } catch (XmlPullParserException e) {
            throw new ako(e);
        }
    }
}
