package p000;

import android.util.Pair;
import java.util.LinkedList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: bdb */
/* compiled from: PG */
abstract class bdb {

    /* renamed from: a */
    private final String f3375a;

    /* renamed from: b */
    private final String f3376b;

    /* renamed from: c */
    private final bdb f3377c;

    /* renamed from: d */
    private final List f3378d = new LinkedList();

    public bdb(bdb bdb, String str, String str2) {
        this.f3377c = bdb;
        this.f3375a = str;
        this.f3376b = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo1771a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1774a(Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1776b(XmlPullParser xmlPullParser) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo1777b(String str) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo1778c(XmlPullParser xmlPullParser) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo1779d(XmlPullParser xmlPullParser) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo1772a(String str) {
        for (int i = 0; i < this.f3378d.size(); i++) {
            Pair pair = (Pair) this.f3378d.get(i);
            if (((String) pair.first).equals(str)) {
                return pair.second;
            }
        }
        bdb bdb = this.f3377c;
        if (bdb != null) {
            return bdb.mo1772a(str);
        }
        return null;
    }

    /* renamed from: a */
    public final Object mo1773a(XmlPullParser xmlPullParser) {
        boolean z = false;
        int i = 0;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            bdb bdb = null;
            if (eventType == 1) {
                return null;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (this.f3376b.equals(name)) {
                    mo1776b(xmlPullParser);
                    z = true;
                } else if (z) {
                    if (i > 0) {
                        i++;
                    } else if (!mo1777b(name)) {
                        String str = this.f3375a;
                        if ("QualityLevel".equals(name)) {
                            bdb = new bde(this, str);
                        } else if ("Protection".equals(name)) {
                            bdb = new bdd(this, str);
                        } else if ("StreamIndex".equals(name)) {
                            bdb = new bdg(this, str);
                        }
                        if (bdb != null) {
                            mo1774a(bdb.mo1773a(xmlPullParser));
                        } else {
                            i = 1;
                        }
                    } else {
                        mo1776b(xmlPullParser);
                    }
                }
            } else if (eventType != 3) {
                if (eventType == 4 && z && i == 0) {
                    mo1778c(xmlPullParser);
                }
            } else if (!z) {
                continue;
            } else if (i > 0) {
                i--;
            } else {
                String name2 = xmlPullParser.getName();
                mo1779d(xmlPullParser);
                if (!mo1777b(name2)) {
                    return mo1771a();
                }
            }
            xmlPullParser.next();
        }
    }

    /* renamed from: a */
    protected static final int m2866a(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -1;
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e) {
            throw new ako(e);
        }
    }

    /* renamed from: a */
    protected static final long m2867a(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        try {
            return Long.parseLong(attributeValue);
        } catch (NumberFormatException e) {
            throw new ako(e);
        }
    }

    /* renamed from: b */
    protected static final int m2868b(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e) {
                throw new ako(e);
            }
        } else {
            throw new bdc(str);
        }
    }

    /* renamed from: c */
    protected static final String m2869c(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return attributeValue;
        }
        throw new bdc(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1775a(String str, Object obj) {
        this.f3378d.add(Pair.create(str, obj));
    }
}
