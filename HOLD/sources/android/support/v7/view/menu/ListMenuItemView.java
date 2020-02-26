package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class ListMenuItemView extends LinearLayout implements AbsListView.SelectionBoundsAdjuster, fw {
    public fp a;
    public ImageView b;
    public boolean c;
    public boolean d;
    public boolean e;
    private ImageView f;
    private RadioButton g;
    private TextView h;
    private CheckBox i;
    private TextView j;
    private ImageView k;
    private LinearLayout l;
    private Drawable m;
    private int n;
    private Context o;
    private Drawable p;
    private LayoutInflater q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    public final fp a() {
        return this.a;
    }

    public final boolean b() {
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: kz.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      kz.a(int, int):int
      kz.a(int, boolean):boolean */
    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        kz a2 = kz.a(getContext(), attributeSet, er.n, i2);
        this.m = a2.a(5);
        this.n = a2.e(1, -1);
        this.c = a2.a(7, false);
        this.o = context;
        this.p = a2.a(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.d = obtainStyledAttributes.hasValue(0);
        a2.a();
        obtainStyledAttributes.recycle();
    }

    private final void a(View view) {
        a(view, -1);
    }

    private final void a(View view, int i2) {
        LinearLayout linearLayout = this.l;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.b;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            rect.top += this.b.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    private final LayoutInflater c() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.support.v7.view.menu.ListMenuItemView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final void a(fp fpVar) {
        ImageView imageView;
        String str;
        int i2;
        RadioButton radioButton;
        CheckBox checkBox;
        CheckBox checkBox2;
        this.a = fpVar;
        int i3 = 0;
        setVisibility(!fpVar.isVisible() ? 8 : 0);
        CharSequence a2 = fpVar.a((fw) this);
        if (a2 != null) {
            this.h.setText(a2);
            if (this.h.getVisibility() != 0) {
                this.h.setVisibility(0);
            }
        } else if (this.h.getVisibility() != 8) {
            this.h.setVisibility(8);
        }
        boolean isCheckable = fpVar.isCheckable();
        if (!(!isCheckable && this.g == null && this.i == null)) {
            if (!this.a.d()) {
                if (this.i == null) {
                    CheckBox checkBox3 = (CheckBox) c().inflate((int) R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                    this.i = checkBox3;
                    a(checkBox3);
                }
                CheckBox checkBox4 = this.i;
                radioButton = this.g;
                checkBox = checkBox4;
                checkBox2 = checkBox4;
            } else {
                if (this.g == null) {
                    RadioButton radioButton2 = (RadioButton) c().inflate((int) R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                    this.g = radioButton2;
                    a(radioButton2);
                }
                RadioButton radioButton3 = this.g;
                radioButton = this.i;
                checkBox = radioButton3;
                checkBox2 = radioButton;
            }
            if (isCheckable) {
                checkBox.setChecked(this.a.isChecked());
                if (checkBox.getVisibility() != 0) {
                    checkBox.setVisibility(0);
                }
                if (!(radioButton == null || radioButton.getVisibility() == 8)) {
                    radioButton.setVisibility(8);
                }
            } else {
                if (checkBox2 != null) {
                    checkBox2.setVisibility(8);
                }
                RadioButton radioButton4 = this.g;
                if (radioButton4 != null) {
                    radioButton4.setVisibility(8);
                }
            }
        }
        boolean c2 = fpVar.c();
        fpVar.b();
        int i4 = (!c2 || !this.a.c()) ? 8 : 0;
        if (i4 == 0) {
            TextView textView = this.j;
            fp fpVar2 = this.a;
            char b2 = fpVar2.b();
            if (b2 != 0) {
                Resources resources = fpVar2.i.a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(fpVar2.i.a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                if (!fpVar2.i.b()) {
                    i2 = fpVar2.f;
                } else {
                    i2 = fpVar2.h;
                }
                fp.a(sb, i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                fp.a(sb, i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                fp.a(sb, i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                fp.a(sb, i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                fp.a(sb, i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                fp.a(sb, i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (b2 == 8) {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (b2 == 10) {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (b2 != ' ') {
                    sb.append(b2);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                str = sb.toString();
            } else {
                str = "";
            }
            textView.setText(str);
        }
        if (this.j.getVisibility() != i4) {
            this.j.setVisibility(i4);
        }
        Drawable icon = fpVar.getIcon();
        boolean z = this.e;
        if ((z || this.c) && !((imageView = this.f) == null && icon == null && !this.c)) {
            if (imageView == null) {
                ImageView imageView2 = (ImageView) c().inflate((int) R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f = imageView2;
                a(imageView2, 0);
            }
            if (icon == null && !this.c) {
                this.f.setVisibility(8);
            } else {
                ImageView imageView3 = this.f;
                if (!z) {
                    icon = null;
                }
                imageView3.setImageDrawable(icon);
                if (this.f.getVisibility() != 0) {
                    this.f.setVisibility(0);
                }
            }
        }
        setEnabled(fpVar.isEnabled());
        boolean hasSubMenu = fpVar.hasSubMenu();
        ImageView imageView4 = this.k;
        if (imageView4 != null) {
            if (!hasSubMenu) {
                i3 = 8;
            }
            imageView4.setVisibility(i3);
        }
        setContentDescription(fpVar.k);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        dx.a(this, this.m);
        TextView textView = (TextView) findViewById(R.id.title);
        this.h = textView;
        int i2 = this.n;
        if (i2 != -1) {
            textView.setTextAppearance(this.o, i2);
        }
        this.j = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.p);
        }
        this.b = (ImageView) findViewById(R.id.group_divider);
        this.l = (LinearLayout) findViewById(R.id.content);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        if (this.f != null && this.c) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i2, i3);
    }
}
