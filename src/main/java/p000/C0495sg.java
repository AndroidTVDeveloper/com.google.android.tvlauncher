package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: sg */
/* compiled from: PG */
public final class C0495sg extends C0486ry {

    /* renamed from: b */
    public static final PorterDuff.Mode f10351b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private C0493se f10352c;

    /* renamed from: d */
    private PorterDuffColorFilter f10353d;

    /* renamed from: e */
    private ColorFilter f10354e;

    /* renamed from: f */
    private boolean f10355f;

    /* renamed from: g */
    private final boolean f10356g;

    /* renamed from: h */
    private final float[] f10357h;

    /* renamed from: i */
    private final Matrix f10358i;

    /* renamed from: j */
    private final Rect f10359j;

    public C0495sg() {
        this.f10356g = true;
        this.f10357h = new float[9];
        this.f10358i = new Matrix();
        this.f10359j = new Rect();
        this.f10352c = new C0493se();
    }

    public C0495sg(C0493se seVar) {
        this.f10356g = true;
        this.f10357h = new float[9];
        this.f10358i = new Matrix();
        this.f10359j = new Rect();
        this.f10352c = seVar;
        this.f10353d = m8290a(seVar.f10340c, seVar.f10341d);
    }

    /* renamed from: a */
    static int m8289a(int i, float f) {
        return (((int) (((float) Color.alpha(i)) * f)) << 24) | (16777215 & i);
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.f10288a;
        if (drawable == null) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        drawable.canApplyTheme();
        return false;
    }

    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f10288a;
        if (drawable == null) {
            copyBounds(this.f10359j);
            if (this.f10359j.width() > 0 && this.f10359j.height() > 0) {
                ColorFilter colorFilter = this.f10354e;
                if (colorFilter == null) {
                    colorFilter = this.f10353d;
                }
                canvas.getMatrix(this.f10358i);
                this.f10358i.getValues(this.f10357h);
                float abs = Math.abs(this.f10357h[0]);
                float abs2 = Math.abs(this.f10357h[4]);
                float abs3 = Math.abs(this.f10357h[1]);
                float abs4 = Math.abs(this.f10357h[3]);
                if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                    abs = 1.0f;
                    abs2 = 1.0f;
                }
                int width = this.f10359j.width();
                int height = this.f10359j.height();
                int min = Math.min(2048, (int) (((float) width) * abs));
                int min2 = Math.min(2048, (int) (((float) height) * abs2));
                if (min > 0 && min2 > 0) {
                    int save = canvas.save();
                    canvas.translate((float) this.f10359j.left, (float) this.f10359j.top);
                    int i = Build.VERSION.SDK_INT;
                    if (isAutoMirrored()) {
                        int i2 = Build.VERSION.SDK_INT;
                        if (getLayoutDirection() == 1) {
                            canvas.translate((float) this.f10359j.width(), 0.0f);
                            canvas.scale(-1.0f, 1.0f);
                        }
                    }
                    this.f10359j.offsetTo(0, 0);
                    C0493se seVar = this.f10352c;
                    Bitmap bitmap = seVar.f10343f;
                    if (!(bitmap != null && min == bitmap.getWidth() && min2 == seVar.f10343f.getHeight())) {
                        seVar.f10343f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                        seVar.f10348k = true;
                    }
                    if (this.f10356g) {
                        C0493se seVar2 = this.f10352c;
                        if (!(!seVar2.f10348k && seVar2.f10344g == seVar2.f10340c && seVar2.f10345h == seVar2.f10341d && seVar2.f10347j == seVar2.f10342e && seVar2.f10346i == seVar2.f10339b.getRootAlpha())) {
                            this.f10352c.mo5884a(min, min2);
                            C0493se seVar3 = this.f10352c;
                            seVar3.f10344g = seVar3.f10340c;
                            seVar3.f10345h = seVar3.f10341d;
                            seVar3.f10346i = seVar3.f10339b.getRootAlpha();
                            seVar3.f10347j = seVar3.f10342e;
                            seVar3.f10348k = false;
                        }
                    } else {
                        this.f10352c.mo5884a(min, min2);
                    }
                    C0493se seVar4 = this.f10352c;
                    Rect rect = this.f10359j;
                    if (seVar4.f10339b.getRootAlpha() >= 255 && colorFilter == null) {
                        paint = null;
                    } else {
                        if (seVar4.f10349l == null) {
                            seVar4.f10349l = new Paint();
                            seVar4.f10349l.setFilterBitmap(true);
                        }
                        seVar4.f10349l.setAlpha(seVar4.f10339b.getRootAlpha());
                        seVar4.f10349l.setColorFilter(colorFilter);
                        paint = seVar4.f10349l;
                    }
                    canvas.drawBitmap(seVar4.f10343f, (Rect) null, rect, paint);
                    canvas.restoreToCount(save);
                    return;
                }
                return;
            }
            return;
        }
        drawable.draw(canvas);
    }

    public final int getAlpha() {
        Drawable drawable = this.f10288a;
        if (drawable == null) {
            return this.f10352c.f10339b.getRootAlpha();
        }
        int i = Build.VERSION.SDK_INT;
        return drawable.getAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f10288a;
        if (drawable == null) {
            return super.getChangingConfigurations() | this.f10352c.getChangingConfigurations();
        }
        return drawable.getChangingConfigurations();
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f10288a;
        if (drawable == null) {
            return this.f10354e;
        }
        int i = Build.VERSION.SDK_INT;
        return drawable.getColorFilter();
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f10288a != null) {
            int i = Build.VERSION.SDK_INT;
            return new C0494sf(this.f10288a.getConstantState());
        }
        this.f10352c.f10338a = getChangingConfigurations();
        return this.f10352c;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f10288a;
        if (drawable == null) {
            return (int) this.f10352c.f10339b.f10327f;
        }
        return drawable.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f10288a;
        if (drawable == null) {
            return (int) this.f10352c.f10339b.f10326e;
        }
        return drawable.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.f10288a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f10288a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        ColorStateList colorStateList;
        Resources resources2 = resources;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        Drawable drawable = this.f10288a;
        if (drawable == null) {
            C0493se seVar = this.f10352c;
            seVar.f10339b = new C0492sd();
            TypedArray a = C0035bg.m3106a(resources2, theme2, attributeSet2, C0485rx.f10284a);
            C0493se seVar2 = this.f10352c;
            C0492sd sdVar = seVar2.f10339b;
            int a2 = C0035bg.m3105a(a, xmlPullParser2, "tintMode", 6, -1);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            if (a2 == 3) {
                mode = PorterDuff.Mode.SRC_OVER;
            } else if (a2 == 5) {
                mode = PorterDuff.Mode.SRC_IN;
            } else if (a2 != 9) {
                switch (a2) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
            seVar2.f10341d = mode;
            int i = 2;
            if (C0035bg.m3112a(xmlPullParser2, "tint")) {
                TypedValue typedValue = new TypedValue();
                a.getValue(1, typedValue);
                if (typedValue.type == 2) {
                    throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
                } else if (typedValue.type < 28 || typedValue.type > 31) {
                    Resources resources3 = a.getResources();
                    try {
                        XmlResourceParser xml = resources3.getXml(a.getResourceId(1, 0));
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        while (true) {
                            int next = xml.next();
                            if (next == 2) {
                                colorStateList = C0086dc.m6102a(resources3, xml, asAttributeSet, theme2);
                            } else if (next == 1) {
                                throw new XmlPullParserException("No start tag found");
                            }
                        }
                    } catch (Exception e) {
                        Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                        colorStateList = null;
                    }
                } else {
                    colorStateList = ColorStateList.valueOf(typedValue.data);
                }
            } else {
                colorStateList = null;
            }
            if (colorStateList != null) {
                seVar2.f10340c = colorStateList;
            }
            boolean z = seVar2.f10342e;
            if (C0035bg.m3112a(xmlPullParser2, "autoMirrored")) {
                z = a.getBoolean(5, z);
            }
            seVar2.f10342e = z;
            sdVar.f10328g = C0035bg.m3101a(a, xmlPullParser2, "viewportWidth", 7, sdVar.f10328g);
            float a3 = C0035bg.m3101a(a, xmlPullParser2, "viewportHeight", 8, sdVar.f10329h);
            sdVar.f10329h = a3;
            if (sdVar.f10328g <= 0.0f) {
                throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
            } else if (a3 > 0.0f) {
                sdVar.f10326e = a.getDimension(3, sdVar.f10326e);
                float dimension = a.getDimension(2, sdVar.f10327f);
                sdVar.f10327f = dimension;
                if (sdVar.f10326e <= 0.0f) {
                    throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires width > 0");
                } else if (dimension > 0.0f) {
                    sdVar.setAlpha(C0035bg.m3101a(a, xmlPullParser2, "alpha", 4, sdVar.getAlpha()));
                    String string = a.getString(0);
                    if (string != null) {
                        sdVar.f10330i = string;
                        sdVar.f10332k.put(string, sdVar);
                    }
                    a.recycle();
                    seVar.f10338a = getChangingConfigurations();
                    seVar.f10348k = true;
                    C0492sd sdVar2 = this.f10352c.f10339b;
                    ArrayDeque arrayDeque = new ArrayDeque();
                    arrayDeque.push(sdVar2.f10325d);
                    int eventType = xmlPullParser.getEventType();
                    int depth = xmlPullParser.getDepth() + 1;
                    boolean z2 = true;
                    for (int i2 = 1; eventType != i2 && (xmlPullParser.getDepth() >= depth || eventType != 3); i2 = 1) {
                        if (eventType == i) {
                            String name = xmlPullParser.getName();
                            C0490sb sbVar = (C0490sb) arrayDeque.peek();
                            if ("path".equals(name)) {
                                C0489sa saVar = new C0489sa();
                                TypedArray a4 = C0035bg.m3106a(resources2, theme2, attributeSet2, C0485rx.f10286c);
                                if (C0035bg.m3112a(xmlPullParser2, "pathData")) {
                                    String string2 = a4.getString(0);
                                    if (string2 != null) {
                                        saVar.f10320m = string2;
                                    }
                                    String string3 = a4.getString(i);
                                    if (string3 != null) {
                                        saVar.f10319l = C0035bg.m3114a(string3);
                                    }
                                    saVar.f10299c = C0035bg.m3108a(a4, xmlPullParser2, theme2, "fillColor", 1);
                                    saVar.f10301e = C0035bg.m3101a(a4, xmlPullParser2, "fillAlpha", 12, saVar.f10301e);
                                    int a5 = C0035bg.m3105a(a4, xmlPullParser2, "strokeLineCap", 8, -1);
                                    Paint.Cap cap = saVar.f10305i;
                                    if (a5 == 0) {
                                        cap = Paint.Cap.BUTT;
                                    } else if (a5 == 1) {
                                        cap = Paint.Cap.ROUND;
                                    } else if (a5 == 2) {
                                        cap = Paint.Cap.SQUARE;
                                    }
                                    saVar.f10305i = cap;
                                    int a6 = C0035bg.m3105a(a4, xmlPullParser2, "strokeLineJoin", 9, -1);
                                    Paint.Join join = saVar.f10306j;
                                    if (a6 == 0) {
                                        join = Paint.Join.MITER;
                                    } else if (a6 == 1) {
                                        join = Paint.Join.ROUND;
                                    } else if (a6 == 2) {
                                        join = Paint.Join.BEVEL;
                                    }
                                    saVar.f10306j = join;
                                    saVar.f10307k = C0035bg.m3101a(a4, xmlPullParser2, "strokeMiterLimit", 10, saVar.f10307k);
                                    saVar.f10297a = C0035bg.m3108a(a4, xmlPullParser2, theme2, "strokeColor", 3);
                                    saVar.f10300d = C0035bg.m3101a(a4, xmlPullParser2, "strokeAlpha", 11, saVar.f10300d);
                                    saVar.f10298b = C0035bg.m3101a(a4, xmlPullParser2, "strokeWidth", 4, saVar.f10298b);
                                    saVar.f10303g = C0035bg.m3101a(a4, xmlPullParser2, "trimPathEnd", 6, saVar.f10303g);
                                    saVar.f10304h = C0035bg.m3101a(a4, xmlPullParser2, "trimPathOffset", 7, saVar.f10304h);
                                    saVar.f10302f = C0035bg.m3101a(a4, xmlPullParser2, "trimPathStart", 5, saVar.f10302f);
                                    saVar.f10321n = C0035bg.m3105a(a4, xmlPullParser2, "fillType", 13, saVar.f10321n);
                                }
                                a4.recycle();
                                sbVar.f10309b.add(saVar);
                                if (saVar.getPathName() != null) {
                                    sdVar2.f10332k.put(saVar.getPathName(), saVar);
                                }
                                z2 = false;
                            } else if ("clip-path".equals(name)) {
                                C0487rz rzVar = new C0487rz();
                                if (C0035bg.m3112a(xmlPullParser2, "pathData")) {
                                    TypedArray a7 = C0035bg.m3106a(resources2, theme2, attributeSet2, C0485rx.f10287d);
                                    String string4 = a7.getString(0);
                                    if (string4 != null) {
                                        rzVar.f10320m = string4;
                                    }
                                    String string5 = a7.getString(1);
                                    if (string5 != null) {
                                        rzVar.f10319l = C0035bg.m3114a(string5);
                                    }
                                    rzVar.f10321n = C0035bg.m3105a(a7, xmlPullParser2, "fillType", 2, 0);
                                    a7.recycle();
                                }
                                sbVar.f10309b.add(rzVar);
                                if (rzVar.getPathName() != null) {
                                    sdVar2.f10332k.put(rzVar.getPathName(), rzVar);
                                }
                            } else if ("group".equals(name)) {
                                C0490sb sbVar2 = new C0490sb();
                                TypedArray a8 = C0035bg.m3106a(resources2, theme2, attributeSet2, C0485rx.f10285b);
                                sbVar2.f10310c = C0035bg.m3101a(a8, xmlPullParser2, "rotation", 5, sbVar2.f10310c);
                                sbVar2.f10311d = a8.getFloat(1, sbVar2.f10311d);
                                sbVar2.f10312e = a8.getFloat(2, sbVar2.f10312e);
                                sbVar2.f10313f = C0035bg.m3101a(a8, xmlPullParser2, "scaleX", 3, sbVar2.f10313f);
                                sbVar2.f10314g = C0035bg.m3101a(a8, xmlPullParser2, "scaleY", 4, sbVar2.f10314g);
                                sbVar2.f10315h = C0035bg.m3101a(a8, xmlPullParser2, "translateX", 6, sbVar2.f10315h);
                                sbVar2.f10316i = C0035bg.m3101a(a8, xmlPullParser2, "translateY", 7, sbVar2.f10316i);
                                String string6 = a8.getString(0);
                                if (string6 != null) {
                                    sbVar2.f10318k = string6;
                                }
                                sbVar2.mo5859a();
                                a8.recycle();
                                sbVar.f10309b.add(sbVar2);
                                arrayDeque.push(sbVar2);
                                if (sbVar2.getGroupName() != null) {
                                    sdVar2.f10332k.put(sbVar2.getGroupName(), sbVar2);
                                }
                            }
                        } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                        eventType = xmlPullParser.next();
                        i = 2;
                    }
                    if (!z2) {
                        this.f10353d = m8290a(seVar.f10340c, seVar.f10341d);
                        return;
                    }
                    throw new XmlPullParserException("no path defined");
                } else {
                    throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires height > 0");
                }
            } else {
                throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
            }
        } else {
            int i3 = Build.VERSION.SDK_INT;
            drawable.inflate(resources2, xmlPullParser2, attributeSet2, theme2);
        }
    }

    public final void invalidateSelf() {
        Drawable drawable = this.f10288a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.f10288a;
        if (drawable == null) {
            return this.f10352c.f10342e;
        }
        return C0045bq.m3949a(drawable);
    }

    public final boolean isStateful() {
        Drawable drawable = this.f10288a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C0493se seVar = this.f10352c;
        if (seVar != null) {
            if (seVar.mo5885a()) {
                return true;
            }
            ColorStateList colorStateList = this.f10352c.f10340c;
            return colorStateList != null && colorStateList.isStateful();
        }
        return false;
    }

    public final Drawable mutate() {
        Drawable drawable = this.f10288a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f10355f && super.mutate() == this) {
            this.f10352c = new C0493se(this.f10352c);
            this.f10355f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f10288a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f10288a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0493se seVar = this.f10352c;
        ColorStateList colorStateList = seVar.f10340c;
        boolean z = false;
        if (!(colorStateList == null || (mode = seVar.f10341d) == null)) {
            this.f10353d = m8290a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (seVar.mo5885a()) {
            boolean a = seVar.f10339b.f10325d.mo2362a(iArr);
            seVar.f10348k |= a;
            if (a) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f10288a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.f10288a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f10352c.f10339b.getRootAlpha() != i) {
            this.f10352c.f10339b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f10288a;
        if (drawable == null) {
            this.f10352c.f10342e = z;
        } else {
            C0045bq.m3947a(drawable, z);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f10288a;
        if (drawable == null) {
            this.f10354e = colorFilter;
            invalidateSelf();
            return;
        }
        drawable.setColorFilter(colorFilter);
    }

    public final void setTint(int i) {
        Drawable drawable = this.f10288a;
        if (drawable == null) {
            setTintList(ColorStateList.valueOf(i));
        } else {
            C0045bq.m3943a(drawable, i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f10288a;
        if (drawable == null) {
            C0493se seVar = this.f10352c;
            if (seVar.f10340c != colorStateList) {
                seVar.f10340c = colorStateList;
                this.f10353d = m8290a(colorStateList, seVar.f10341d);
                invalidateSelf();
                return;
            }
            return;
        }
        C0045bq.m3945a(drawable, colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f10288a;
        if (drawable == null) {
            C0493se seVar = this.f10352c;
            if (seVar.f10341d != mode) {
                seVar.f10341d = mode;
                this.f10353d = m8290a(seVar.f10340c, mode);
                invalidateSelf();
                return;
            }
            return;
        }
        C0045bq.m3946a(drawable, mode);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f10288a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f10288a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: a */
    private final PorterDuffColorFilter m8290a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
