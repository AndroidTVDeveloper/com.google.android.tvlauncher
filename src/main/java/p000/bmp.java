package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.leanback.transition.FadeAndShortSlide;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: bmp */
/* compiled from: PG */
public class bmp {
    /* renamed from: a */
    public float mo2154a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        return view.getTranslationX();
    }

    /* renamed from: b */
    public float mo2155b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        return view.getTranslationY();
    }

    /* renamed from: a */
    public static boolean m3762a(ViewGroup viewGroup, View view) {
        while (view != null) {
            if (view == viewGroup) {
                return true;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                return false;
            }
            view = (View) parent;
        }
        return false;
    }

    /* renamed from: c */
    public static String m3768c(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m3763a(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    /* renamed from: a */
    public static boolean m3764a(XmlPullParser xmlPullParser, String str) {
        return m3763a(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: b */
    public static boolean m3766b(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: b */
    public static boolean m3767b(XmlPullParser xmlPullParser, String str) {
        return m3766b(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: b */
    public static String m3765b(String str) {
        int indexOf = str.indexOf(58);
        return indexOf != -1 ? str.substring(indexOf + 1) : str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r3 >= 300) goto L_0x001c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m3761a(java.lang.String r7) {
        /*
            java.lang.String r0 = ". "
            java.lang.String r1 = "HttpUrlPinger"
            java.net.URL r2 = new java.net.URL     // Catch:{ IndexOutOfBoundsException -> 0x0081, IOException -> 0x004e, RuntimeException -> 0x004c }
            r2.<init>(r7)     // Catch:{ IndexOutOfBoundsException -> 0x0081, IOException -> 0x004e, RuntimeException -> 0x004c }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IndexOutOfBoundsException -> 0x0081, IOException -> 0x004e, RuntimeException -> 0x004c }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IndexOutOfBoundsException -> 0x0081, IOException -> 0x004e, RuntimeException -> 0x004c }
            int r3 = r2.getResponseCode()     // Catch:{ all -> 0x0047 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 >= r4) goto L_0x0018
            goto L_0x001c
        L_0x0018:
            r4 = 300(0x12c, float:4.2E-43)
            if (r3 < r4) goto L_0x0043
        L_0x001c:
            java.lang.String r4 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0047 }
            int r4 = r4.length()     // Catch:{ all -> 0x0047 }
            int r4 = r4 + 65
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0047 }
            r5.<init>(r4)     // Catch:{ all -> 0x0047 }
            java.lang.String r4 = "Received non-success response code "
            r5.append(r4)     // Catch:{ all -> 0x0047 }
            r5.append(r3)     // Catch:{ all -> 0x0047 }
            java.lang.String r3 = " from pinging URL: "
            r5.append(r3)     // Catch:{ all -> 0x0047 }
            r5.append(r7)     // Catch:{ all -> 0x0047 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0047 }
            android.util.Log.w(r1, r3)     // Catch:{ all -> 0x0047 }
        L_0x0043:
            r2.disconnect()     // Catch:{ IndexOutOfBoundsException -> 0x0081, IOException -> 0x004e, RuntimeException -> 0x004c }
            return
        L_0x0047:
            r3 = move-exception
            r2.disconnect()     // Catch:{ IndexOutOfBoundsException -> 0x0081, IOException -> 0x004e, RuntimeException -> 0x004c }
            throw r3     // Catch:{ IndexOutOfBoundsException -> 0x0081, IOException -> 0x004e, RuntimeException -> 0x004c }
        L_0x004c:
            r2 = move-exception
            goto L_0x004f
        L_0x004e:
            r2 = move-exception
        L_0x004f:
            java.lang.String r3 = r2.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r7)
            int r4 = r4.length()
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 27
            int r4 = r4 + r5
            r6.<init>(r4)
            java.lang.String r4 = "Error while pinging URL: "
            r6.append(r4)
            r6.append(r7)
            r6.append(r0)
            r6.append(r3)
            java.lang.String r7 = r6.toString()
            android.util.Log.w(r1, r7, r2)
            return
        L_0x0081:
            r2 = move-exception
            java.lang.String r3 = r2.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r7)
            int r4 = r4.length()
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 32
            int r4 = r4 + r5
            r6.<init>(r4)
            java.lang.String r4 = "Error while parsing ping URL: "
            r6.append(r4)
            r6.append(r7)
            r6.append(r0)
            r6.append(r3)
            java.lang.String r7 = r6.toString()
            android.util.Log.w(r1, r7, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bmp.m3761a(java.lang.String):void");
    }
}
