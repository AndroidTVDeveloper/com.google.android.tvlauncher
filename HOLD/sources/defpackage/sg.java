package defpackage;

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

/* renamed from: sg  reason: default package */
/* compiled from: PG */
public final class sg extends ry {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    private se c;
    private PorterDuffColorFilter d;
    private ColorFilter e;
    private boolean f;
    private final boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    public sg() {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.c = new se();
    }

    public sg(se seVar) {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.c = seVar;
        this.d = a(seVar.c, seVar.d);
    }

    static int a(int i2, float f2) {
        return (((int) (((float) Color.alpha(i2)) * f2)) << 24) | (16777215 & i2);
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        drawable.canApplyTheme();
        return false;
    }

    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.a;
        if (drawable == null) {
            copyBounds(this.j);
            if (this.j.width() > 0 && this.j.height() > 0) {
                ColorFilter colorFilter = this.e;
                if (colorFilter == null) {
                    colorFilter = this.d;
                }
                canvas.getMatrix(this.i);
                this.i.getValues(this.h);
                float abs = Math.abs(this.h[0]);
                float abs2 = Math.abs(this.h[4]);
                float abs3 = Math.abs(this.h[1]);
                float abs4 = Math.abs(this.h[3]);
                if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                    abs = 1.0f;
                    abs2 = 1.0f;
                }
                int width = this.j.width();
                int height = this.j.height();
                int min = Math.min(2048, (int) (((float) width) * abs));
                int min2 = Math.min(2048, (int) (((float) height) * abs2));
                if (min > 0 && min2 > 0) {
                    int save = canvas.save();
                    canvas.translate((float) this.j.left, (float) this.j.top);
                    int i2 = Build.VERSION.SDK_INT;
                    if (isAutoMirrored()) {
                        int i3 = Build.VERSION.SDK_INT;
                        if (getLayoutDirection() == 1) {
                            canvas.translate((float) this.j.width(), 0.0f);
                            canvas.scale(-1.0f, 1.0f);
                        }
                    }
                    this.j.offsetTo(0, 0);
                    se seVar = this.c;
                    Bitmap bitmap = seVar.f;
                    if (!(bitmap != null && min == bitmap.getWidth() && min2 == seVar.f.getHeight())) {
                        seVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                        seVar.k = true;
                    }
                    if (this.g) {
                        se seVar2 = this.c;
                        if (!(!seVar2.k && seVar2.g == seVar2.c && seVar2.h == seVar2.d && seVar2.j == seVar2.e && seVar2.i == seVar2.b.getRootAlpha())) {
                            this.c.a(min, min2);
                            se seVar3 = this.c;
                            seVar3.g = seVar3.c;
                            seVar3.h = seVar3.d;
                            seVar3.i = seVar3.b.getRootAlpha();
                            seVar3.j = seVar3.e;
                            seVar3.k = false;
                        }
                    } else {
                        this.c.a(min, min2);
                    }
                    se seVar4 = this.c;
                    Rect rect = this.j;
                    if (seVar4.b.getRootAlpha() >= 255 && colorFilter == null) {
                        paint = null;
                    } else {
                        if (seVar4.l == null) {
                            seVar4.l = new Paint();
                            seVar4.l.setFilterBitmap(true);
                        }
                        seVar4.l.setAlpha(seVar4.b.getRootAlpha());
                        seVar4.l.setColorFilter(colorFilter);
                        paint = seVar4.l;
                    }
                    canvas.drawBitmap(seVar4.f, (Rect) null, rect, paint);
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
        Drawable drawable = this.a;
        if (drawable == null) {
            return this.c.b.getRootAlpha();
        }
        int i2 = Build.VERSION.SDK_INT;
        return drawable.getAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return super.getChangingConfigurations() | this.c.getChangingConfigurations();
        }
        return drawable.getChangingConfigurations();
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return this.e;
        }
        int i2 = Build.VERSION.SDK_INT;
        return drawable.getColorFilter();
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.a != null) {
            int i2 = Build.VERSION.SDK_INT;
            return new sf(this.a.getConstantState());
        }
        this.c.a = getChangingConfigurations();
        return this.c;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return (int) this.c.b.f;
        }
        return drawable.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return (int) this.c.b.e;
        }
        return drawable.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.a;
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
        Drawable drawable = this.a;
        if (drawable == null) {
            se seVar = this.c;
            seVar.b = new sd();
            TypedArray a = bg.a(resources2, theme2, attributeSet2, rx.a);
            se seVar2 = this.c;
            sd sdVar = seVar2.b;
            int a2 = bg.a(a, xmlPullParser2, "tintMode", 6, -1);
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
            seVar2.d = mode;
            int i2 = 2;
            if (bg.a(xmlPullParser2, "tint")) {
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
                                colorStateList = dc.a(resources3, xml, asAttributeSet, theme2);
                            } else if (next == 1) {
                                throw new XmlPullParserException("No start tag found");
                            }
                        }
                    } catch (Exception e2) {
                        Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                        colorStateList = null;
                    }
                } else {
                    colorStateList = ColorStateList.valueOf(typedValue.data);
                }
            } else {
                colorStateList = null;
            }
            if (colorStateList != null) {
                seVar2.c = colorStateList;
            }
            boolean z = seVar2.e;
            if (bg.a(xmlPullParser2, "autoMirrored")) {
                z = a.getBoolean(5, z);
            }
            seVar2.e = z;
            sdVar.g = bg.a(a, xmlPullParser2, "viewportWidth", 7, sdVar.g);
            float a3 = bg.a(a, xmlPullParser2, "viewportHeight", 8, sdVar.h);
            sdVar.h = a3;
            if (sdVar.g <= 0.0f) {
                throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
            } else if (a3 > 0.0f) {
                sdVar.e = a.getDimension(3, sdVar.e);
                float dimension = a.getDimension(2, sdVar.f);
                sdVar.f = dimension;
                if (sdVar.e <= 0.0f) {
                    throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires width > 0");
                } else if (dimension > 0.0f) {
                    sdVar.setAlpha(bg.a(a, xmlPullParser2, "alpha", 4, sdVar.getAlpha()));
                    String string = a.getString(0);
                    if (string != null) {
                        sdVar.i = string;
                        sdVar.k.put(string, sdVar);
                    }
                    a.recycle();
                    seVar.a = getChangingConfigurations();
                    seVar.k = true;
                    sd sdVar2 = this.c.b;
                    ArrayDeque arrayDeque = new ArrayDeque();
                    arrayDeque.push(sdVar2.d);
                    int eventType = xmlPullParser.getEventType();
                    int depth = xmlPullParser.getDepth() + 1;
                    boolean z2 = true;
                    for (int i3 = 1; eventType != i3 && (xmlPullParser.getDepth() >= depth || eventType != 3); i3 = 1) {
                        if (eventType == i2) {
                            String name = xmlPullParser.getName();
                            sb sbVar = (sb) arrayDeque.peek();
                            if ("path".equals(name)) {
                                sa saVar = new sa();
                                TypedArray a4 = bg.a(resources2, theme2, attributeSet2, rx.c);
                                if (bg.a(xmlPullParser2, "pathData")) {
                                    String string2 = a4.getString(0);
                                    if (string2 != null) {
                                        saVar.m = string2;
                                    }
                                    String string3 = a4.getString(i2);
                                    if (string3 != null) {
                                        saVar.l = bg.a(string3);
                                    }
                                    saVar.c = bg.a(a4, xmlPullParser2, theme2, "fillColor", 1);
                                    saVar.e = bg.a(a4, xmlPullParser2, "fillAlpha", 12, saVar.e);
                                    int a5 = bg.a(a4, xmlPullParser2, "strokeLineCap", 8, -1);
                                    Paint.Cap cap = saVar.i;
                                    if (a5 == 0) {
                                        cap = Paint.Cap.BUTT;
                                    } else if (a5 == 1) {
                                        cap = Paint.Cap.ROUND;
                                    } else if (a5 == 2) {
                                        cap = Paint.Cap.SQUARE;
                                    }
                                    saVar.i = cap;
                                    int a6 = bg.a(a4, xmlPullParser2, "strokeLineJoin", 9, -1);
                                    Paint.Join join = saVar.j;
                                    if (a6 == 0) {
                                        join = Paint.Join.MITER;
                                    } else if (a6 == 1) {
                                        join = Paint.Join.ROUND;
                                    } else if (a6 == 2) {
                                        join = Paint.Join.BEVEL;
                                    }
                                    saVar.j = join;
                                    saVar.k = bg.a(a4, xmlPullParser2, "strokeMiterLimit", 10, saVar.k);
                                    saVar.a = bg.a(a4, xmlPullParser2, theme2, "strokeColor", 3);
                                    saVar.d = bg.a(a4, xmlPullParser2, "strokeAlpha", 11, saVar.d);
                                    saVar.b = bg.a(a4, xmlPullParser2, "strokeWidth", 4, saVar.b);
                                    saVar.g = bg.a(a4, xmlPullParser2, "trimPathEnd", 6, saVar.g);
                                    saVar.h = bg.a(a4, xmlPullParser2, "trimPathOffset", 7, saVar.h);
                                    saVar.f = bg.a(a4, xmlPullParser2, "trimPathStart", 5, saVar.f);
                                    saVar.n = bg.a(a4, xmlPullParser2, "fillType", 13, saVar.n);
                                }
                                a4.recycle();
                                sbVar.b.add(saVar);
                                if (saVar.getPathName() != null) {
                                    sdVar2.k.put(saVar.getPathName(), saVar);
                                }
                                z2 = false;
                            } else if ("clip-path".equals(name)) {
                                rz rzVar = new rz();
                                if (bg.a(xmlPullParser2, "pathData")) {
                                    TypedArray a7 = bg.a(resources2, theme2, attributeSet2, rx.d);
                                    String string4 = a7.getString(0);
                                    if (string4 != null) {
                                        rzVar.m = string4;
                                    }
                                    String string5 = a7.getString(1);
                                    if (string5 != null) {
                                        rzVar.l = bg.a(string5);
                                    }
                                    rzVar.n = bg.a(a7, xmlPullParser2, "fillType", 2, 0);
                                    a7.recycle();
                                }
                                sbVar.b.add(rzVar);
                                if (rzVar.getPathName() != null) {
                                    sdVar2.k.put(rzVar.getPathName(), rzVar);
                                }
                            } else if ("group".equals(name)) {
                                sb sbVar2 = new sb();
                                TypedArray a8 = bg.a(resources2, theme2, attributeSet2, rx.b);
                                sbVar2.c = bg.a(a8, xmlPullParser2, "rotation", 5, sbVar2.c);
                                sbVar2.d = a8.getFloat(1, sbVar2.d);
                                sbVar2.e = a8.getFloat(2, sbVar2.e);
                                sbVar2.f = bg.a(a8, xmlPullParser2, "scaleX", 3, sbVar2.f);
                                sbVar2.g = bg.a(a8, xmlPullParser2, "scaleY", 4, sbVar2.g);
                                sbVar2.h = bg.a(a8, xmlPullParser2, "translateX", 6, sbVar2.h);
                                sbVar2.i = bg.a(a8, xmlPullParser2, "translateY", 7, sbVar2.i);
                                String string6 = a8.getString(0);
                                if (string6 != null) {
                                    sbVar2.k = string6;
                                }
                                sbVar2.a();
                                a8.recycle();
                                sbVar.b.add(sbVar2);
                                arrayDeque.push(sbVar2);
                                if (sbVar2.getGroupName() != null) {
                                    sdVar2.k.put(sbVar2.getGroupName(), sbVar2);
                                }
                            }
                        } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                        eventType = xmlPullParser.next();
                        i2 = 2;
                    }
                    if (!z2) {
                        this.d = a(seVar.c, seVar.d);
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
            int i4 = Build.VERSION.SDK_INT;
            drawable.inflate(resources2, xmlPullParser2, attributeSet2, theme2);
        }
    }

    public final void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return this.c.e;
        }
        return bq.a(drawable);
    }

    public final boolean isStateful() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        se seVar = this.c;
        if (seVar != null) {
            if (seVar.a()) {
                return true;
            }
            ColorStateList colorStateList = this.c.c;
            return colorStateList != null && colorStateList.isStateful();
        }
        return false;
    }

    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f && super.mutate() == this) {
            this.c = new se(this.c);
            this.f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        se seVar = this.c;
        ColorStateList colorStateList = seVar.c;
        boolean z = false;
        if (!(colorStateList == null || (mode = seVar.d) == null)) {
            this.d = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (seVar.a()) {
            boolean a = seVar.b.d.a(iArr);
            seVar.k |= a;
            if (a) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public final void setAlpha(int i2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.c.b.getRootAlpha() != i2) {
            this.c.b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable == null) {
            this.c.e = z;
        } else {
            bq.a(drawable, z);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable == null) {
            this.e = colorFilter;
            invalidateSelf();
            return;
        }
        drawable.setColorFilter(colorFilter);
    }

    public final void setTint(int i2) {
        Drawable drawable = this.a;
        if (drawable == null) {
            setTintList(ColorStateList.valueOf(i2));
        } else {
            bq.a(drawable, i2);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable == null) {
            se seVar = this.c;
            if (seVar.c != colorStateList) {
                seVar.c = colorStateList;
                this.d = a(colorStateList, seVar.d);
                invalidateSelf();
                return;
            }
            return;
        }
        bq.a(drawable, colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable == null) {
            se seVar = this.c;
            if (seVar.d != mode) {
                seVar.d = mode;
                this.d = a(seVar.c, mode);
                invalidateSelf();
                return;
            }
            return;
        }
        bq.a(drawable, mode);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    private final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
