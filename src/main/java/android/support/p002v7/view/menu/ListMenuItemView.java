package android.support.p002v7.view.menu;

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

/* renamed from: android.support.v7.view.menu.ListMenuItemView */
/* compiled from: PG */
public class ListMenuItemView extends LinearLayout implements AbsListView.SelectionBoundsAdjuster, C0160fw {

    /* renamed from: a */
    public C0153fp f962a;

    /* renamed from: b */
    public ImageView f963b;

    /* renamed from: c */
    public boolean f964c;

    /* renamed from: d */
    public boolean f965d;

    /* renamed from: e */
    public boolean f966e;

    /* renamed from: f */
    private ImageView f967f;

    /* renamed from: g */
    private RadioButton f968g;

    /* renamed from: h */
    private TextView f969h;

    /* renamed from: i */
    private CheckBox f970i;

    /* renamed from: j */
    private TextView f971j;

    /* renamed from: k */
    private ImageView f972k;

    /* renamed from: l */
    private LinearLayout f973l;

    /* renamed from: m */
    private Drawable f974m;

    /* renamed from: n */
    private int f975n;

    /* renamed from: o */
    private Context f976o;

    /* renamed from: p */
    private Drawable f977p;

    /* renamed from: q */
    private LayoutInflater f978q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    /* renamed from: a */
    public final C0153fp mo747a() {
        return this.f962a;
    }

    /* renamed from: b */
    public final boolean mo749b() {
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: kz.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      kz.a(int, int):int
      kz.a(int, boolean):boolean */
    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0298kz a = C0298kz.m7865a(getContext(), attributeSet, C0128er.f9176n, i);
        this.f974m = a.mo5512a(5);
        this.f975n = a.mo5521e(1, -1);
        this.f964c = a.mo5514a(7, false);
        this.f976o = context;
        this.f977p = a.mo5512a(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f965d = obtainStyledAttributes.hasValue(0);
        a.mo5513a();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private final void m1256a(View view) {
        m1257a(view, -1);
    }

    /* renamed from: a */
    private final void m1257a(View view, int i) {
        LinearLayout linearLayout = this.f973l;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f963b;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f963b.getLayoutParams();
            rect.top += this.f963b.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* renamed from: c */
    private final LayoutInflater m1258c() {
        if (this.f978q == null) {
            this.f978q = LayoutInflater.from(getContext());
        }
        return this.f978q;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.support.v7.view.menu.ListMenuItemView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final void mo748a(C0153fp fpVar) {
        ImageView imageView;
        String str;
        int i;
        RadioButton radioButton;
        CheckBox checkBox;
        CheckBox checkBox2;
        this.f962a = fpVar;
        int i2 = 0;
        setVisibility(!fpVar.isVisible() ? 8 : 0);
        CharSequence a = fpVar.mo4907a((C0160fw) this);
        if (a != null) {
            this.f969h.setText(a);
            if (this.f969h.getVisibility() != 0) {
                this.f969h.setVisibility(0);
            }
        } else if (this.f969h.getVisibility() != 8) {
            this.f969h.setVisibility(8);
        }
        boolean isCheckable = fpVar.isCheckable();
        if (!(!isCheckable && this.f968g == null && this.f970i == null)) {
            if (!this.f962a.mo4917d()) {
                if (this.f970i == null) {
                    CheckBox checkBox3 = (CheckBox) m1258c().inflate((int) R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                    this.f970i = checkBox3;
                    m1256a(checkBox3);
                }
                CheckBox checkBox4 = this.f970i;
                radioButton = this.f968g;
                checkBox = checkBox4;
                checkBox2 = checkBox4;
            } else {
                if (this.f968g == null) {
                    RadioButton radioButton2 = (RadioButton) m1258c().inflate((int) R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                    this.f968g = radioButton2;
                    m1256a(radioButton2);
                }
                RadioButton radioButton3 = this.f968g;
                radioButton = this.f970i;
                checkBox = radioButton3;
                checkBox2 = radioButton;
            }
            if (isCheckable) {
                checkBox.setChecked(this.f962a.isChecked());
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
                RadioButton radioButton4 = this.f968g;
                if (radioButton4 != null) {
                    radioButton4.setVisibility(8);
                }
            }
        }
        boolean c = fpVar.mo4914c();
        fpVar.mo4911b();
        int i3 = (!c || !this.f962a.mo4914c()) ? 8 : 0;
        if (i3 == 0) {
            TextView textView = this.f971j;
            C0153fp fpVar2 = this.f962a;
            char b = fpVar2.mo4911b();
            if (b != 0) {
                Resources resources = fpVar2.f9333i.f9303a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(fpVar2.f9333i.f9303a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                if (!fpVar2.f9333i.mo4879b()) {
                    i = fpVar2.f9330f;
                } else {
                    i = fpVar2.f9332h;
                }
                C0153fp.m7338a(sb, i, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                C0153fp.m7338a(sb, i, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                C0153fp.m7338a(sb, i, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                C0153fp.m7338a(sb, i, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                C0153fp.m7338a(sb, i, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                C0153fp.m7338a(sb, i, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (b == 8) {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (b == 10) {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (b != ' ') {
                    sb.append(b);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                str = sb.toString();
            } else {
                str = "";
            }
            textView.setText(str);
        }
        if (this.f971j.getVisibility() != i3) {
            this.f971j.setVisibility(i3);
        }
        Drawable icon = fpVar.getIcon();
        boolean z = this.f966e;
        if ((z || this.f964c) && !((imageView = this.f967f) == null && icon == null && !this.f964c)) {
            if (imageView == null) {
                ImageView imageView2 = (ImageView) m1258c().inflate((int) R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f967f = imageView2;
                m1257a(imageView2, 0);
            }
            if (icon == null && !this.f964c) {
                this.f967f.setVisibility(8);
            } else {
                ImageView imageView3 = this.f967f;
                if (!z) {
                    icon = null;
                }
                imageView3.setImageDrawable(icon);
                if (this.f967f.getVisibility() != 0) {
                    this.f967f.setVisibility(0);
                }
            }
        }
        setEnabled(fpVar.isEnabled());
        boolean hasSubMenu = fpVar.hasSubMenu();
        ImageView imageView4 = this.f972k;
        if (imageView4 != null) {
            if (!hasSubMenu) {
                i2 = 8;
            }
            imageView4.setVisibility(i2);
        }
        setContentDescription(fpVar.f9335k);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        C0107dx.m7199a(this, this.f974m);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f969h = textView;
        int i = this.f975n;
        if (i != -1) {
            textView.setTextAppearance(this.f976o, i);
        }
        this.f971j = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f972k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f977p);
        }
        this.f963b = (ImageView) findViewById(R.id.group_divider);
        this.f973l = (LinearLayout) findViewById(R.id.content);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.f967f != null && this.f964c) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f967f.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }
}
