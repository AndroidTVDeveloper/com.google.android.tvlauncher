package defpackage;

import android.util.Pair;
import java.util.LinkedList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: bdb  reason: default package */
/* compiled from: PG */
abstract class bdb {
    private final String a;
    private final String b;
    private final bdb c;
    private final List d = new LinkedList();

    public bdb(bdb bdb, String str, String str2) {
        this.c = bdb;
        this.a = str;
        this.b = str2;
    }

    /* access modifiers changed from: protected */
    public abstract Object a();

    /* access modifiers changed from: protected */
    public void a(Object obj) {
    }

    /* access modifiers changed from: protected */
    public void b(XmlPullParser xmlPullParser) {
    }

    /* access modifiers changed from: protected */
    public boolean b(String str) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void c(XmlPullParser xmlPullParser) {
    }

    /* access modifiers changed from: protected */
    public void d(XmlPullParser xmlPullParser) {
    }

    /* access modifiers changed from: protected */
    public final Object a(String str) {
        for (int i = 0; i < this.d.size(); i++) {
            Pair pair = (Pair) this.d.get(i);
            if (((String) pair.first).equals(str)) {
                return pair.second;
            }
        }
        bdb bdb = this.c;
        if (bdb != null) {
            return bdb.a(str);
        }
        return null;
    }

    public final Object a(XmlPullParser xmlPullParser) {
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
                if (this.b.equals(name)) {
                    b(xmlPullParser);
                    z = true;
                } else if (z) {
                    if (i > 0) {
                        i++;
                    } else if (!b(name)) {
                        String str = this.a;
                        if ("QualityLevel".equals(name)) {
                            bdb = new bde(this, str);
                        } else if ("Protection".equals(name)) {
                            bdb = new bdd(this, str);
                        } else if ("StreamIndex".equals(name)) {
                            bdb = new bdg(this, str);
                        }
                        if (bdb != null) {
                            a(bdb.a(xmlPullParser));
                        } else {
                            i = 1;
                        }
                    } else {
                        b(xmlPullParser);
                    }
                }
            } else if (eventType != 3) {
                if (eventType == 4 && z && i == 0) {
                    c(xmlPullParser);
                }
            } else if (!z) {
                continue;
            } else if (i > 0) {
                i--;
            } else {
                String name2 = xmlPullParser.getName();
                d(xmlPullParser);
                if (!b(name2)) {
                    return a();
                }
            }
            xmlPullParser.next();
        }
    }

    protected static final int a(XmlPullParser xmlPullParser, String str) {
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

    protected static final long a(XmlPullParser xmlPullParser, String str, long j) {
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

    protected static final int b(XmlPullParser xmlPullParser, String str) {
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

    protected static final String c(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return attributeValue;
        }
        throw new bdc(str);
    }

    /* access modifiers changed from: protected */
    public final void a(String str, Object obj) {
        this.d.add(Pair.create(str, obj));
    }
}
