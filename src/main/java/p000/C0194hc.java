package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: hc */
/* compiled from: PG */
public class C0194hc {
    public C0194hc() {
        new AtomicReference();
    }

    /* renamed from: c */
    public static int m7489c(int i) {
        if (i <= 4) {
            return 8;
        }
        return i + i;
    }

    /* renamed from: a */
    public static Typeface m7483a(Context context, Resources resources, TypedValue typedValue, int i, int i2, C0031bc bcVar) {
        C0026ay ayVar;
        boolean z;
        int i3;
        Resources resources2 = resources;
        TypedValue typedValue2 = typedValue;
        int i4 = i;
        int i5 = i2;
        C0031bc bcVar2 = bcVar;
        if (typedValue2.string != null) {
            String charSequence = typedValue2.string.toString();
            String str = null;
            if (charSequence.startsWith("res/")) {
                Typeface typeface = (Typeface) C0036bh.f3915b.mo3692a(C0036bh.m3216a(resources2, i4, i5));
                if (typeface != null) {
                    bcVar2.mo1752b(typeface);
                    return typeface;
                }
                try {
                    if (!charSequence.toLowerCase().endsWith(".xml")) {
                        Typeface a = C0036bh.m3213a(context, resources2, i4, charSequence, i5);
                        if (a == null) {
                            C0031bc.m2781a();
                        } else {
                            bcVar2.mo1752b(a);
                        }
                        return a;
                    }
                    Context context2 = context;
                    XmlResourceParser xml = resources2.getXml(i4);
                    while (true) {
                        int next = xml.next();
                        if (next == 2) {
                            xml.require(2, str, "font-family");
                            if (xml.getName().equals("font-family")) {
                                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xml), C0677z.f10845b);
                                String string = obtainAttributes.getString(0);
                                String string2 = obtainAttributes.getString(4);
                                String string3 = obtainAttributes.getString(5);
                                int resourceId = obtainAttributes.getResourceId(1, 0);
                                int integer = obtainAttributes.getInteger(2, 1);
                                int integer2 = obtainAttributes.getInteger(3, 500);
                                obtainAttributes.recycle();
                                if (string != null) {
                                    if (!(string2 == null || string3 == null)) {
                                        while (xml.next() != 3) {
                                            C0122el.m7252a(xml);
                                        }
                                        ayVar = new C0026ay(new C0050bv(string, string2, string3, C0122el.m7246a(resources2, resourceId)), integer, integer2);
                                    }
                                }
                                ArrayList arrayList = new ArrayList();
                                while (xml.next() != 3) {
                                    if (xml.getEventType() == 2) {
                                        if (xml.getName().equals("font")) {
                                            TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xml), C0677z.f10846c);
                                            int i6 = 8;
                                            if (!obtainAttributes2.hasValue(8)) {
                                                i6 = 1;
                                            }
                                            int i7 = obtainAttributes2.getInt(i6, 400);
                                            int i8 = 6;
                                            if (!obtainAttributes2.hasValue(6)) {
                                                i8 = 2;
                                            }
                                            if (obtainAttributes2.getInt(i8, 0) == 1) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            int i9 = 9;
                                            if (!obtainAttributes2.hasValue(9)) {
                                                i9 = 3;
                                            }
                                            int i10 = 7;
                                            if (!obtainAttributes2.hasValue(7)) {
                                                i10 = 4;
                                            }
                                            String string4 = obtainAttributes2.getString(i10);
                                            int i11 = obtainAttributes2.getInt(i9, 0);
                                            if (!obtainAttributes2.hasValue(5)) {
                                                i3 = 0;
                                            } else {
                                                i3 = 5;
                                            }
                                            int resourceId2 = obtainAttributes2.getResourceId(i3, 0);
                                            String string5 = obtainAttributes2.getString(i3);
                                            obtainAttributes2.recycle();
                                            while (xml.next() != 3) {
                                                C0122el.m7252a(xml);
                                            }
                                            arrayList.add(new C0025ax(string5, i7, z, string4, i11, resourceId2));
                                        } else {
                                            C0122el.m7252a(xml);
                                        }
                                    }
                                }
                                ayVar = !arrayList.isEmpty() ? new C0024aw((C0025ax[]) arrayList.toArray(new C0025ax[arrayList.size()])) : null;
                            } else {
                                C0122el.m7252a(xml);
                                ayVar = null;
                            }
                            if (ayVar != null) {
                                return C0036bh.m3215a(context, ayVar, resources, i, i2, bcVar);
                            }
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            C0031bc.m2781a();
                            return null;
                        } else if (next != 1) {
                            str = null;
                        } else {
                            throw new XmlPullParserException("No start tag found");
                        }
                    }
                } catch (XmlPullParserException e) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource " + charSequence, e);
                    C0031bc.m2781a();
                    return null;
                } catch (IOException e2) {
                    Log.e("ResourcesCompat", "Failed to read xml resource " + charSequence, e2);
                    C0031bc.m2781a();
                    return null;
                }
            } else {
                C0031bc.m2781a();
                return null;
            }
        } else {
            throw new Resources.NotFoundException("Resource \"" + resources2.getResourceName(i4) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue2);
        }
    }

    /* renamed from: a */
    public static void m7486a(PopupWindow popupWindow, boolean z) {
        int i = Build.VERSION.SDK_INT;
        popupWindow.setOverlapAnchor(z);
    }

    /* renamed from: a */
    public static void m7487a(TextView textView, int i) {
        int i2;
        C0086dc.m6105a(i);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = Build.VERSION.SDK_INT;
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: b */
    public static void m7488b(TextView textView, int i) {
        int i2;
        C0086dc.m6105a(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = Build.VERSION.SDK_INT;
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: c */
    public static void m7490c(TextView textView, int i) {
        C0086dc.m6105a(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: a */
    public static ActionMode.Callback m7484a(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof C0126ep)) ? callback : new C0126ep(callback, textView);
    }

    /* renamed from: a */
    static InputConnection m7485a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (parent instanceof View) {
                    if (parent instanceof C0314lo) {
                        editorInfo.hintText = ((C0314lo) parent).mo5540a();
                        break;
                    }
                    parent = parent.getParent();
                } else {
                    break;
                }
            }
        }
        return inputConnection;
    }
}
