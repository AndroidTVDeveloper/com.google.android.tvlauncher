package p000;

import android.net.Uri;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: bdh */
/* compiled from: PG */
public final class bdh implements biz {

    /* renamed from: a */
    private final XmlPullParserFactory f3398a;

    public bdh() {
        try {
            this.f3398a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final bda mo1648a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f3398a.newPullParser();
            newPullParser.setInput(inputStream, null);
            return (bda) new bdf(uri.toString()).mo1773a(newPullParser);
        } catch (XmlPullParserException e) {
            throw new ako(e);
        }
    }
}
