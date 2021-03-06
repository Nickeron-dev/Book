PGDMP     7                    y           testdb    13.2    13.2 #    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16396    testdb    DATABASE     j   CREATE DATABASE testdb WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'English_United States.1252';
    DROP DATABASE testdb;
                postgres    false            �            1259    16623    author    TABLE     m   CREATE TABLE public.author (
    author_id integer NOT NULL,
    full_name text NOT NULL,
    rating real
);
    DROP TABLE public.author;
       public         heap    postgres    false            �            1259    16615    book    TABLE     l   CREATE TABLE public.book (
    book_id integer NOT NULL,
    title text NOT NULL,
    isbn text NOT NULL
);
    DROP TABLE public.book;
       public         heap    postgres    false            �            1259    16631    book_author    TABLE     b   CREATE TABLE public.book_author (
    book_id integer NOT NULL,
    author_id integer NOT NULL
);
    DROP TABLE public.book_author;
       public         heap    postgres    false            �            1259    25062    donate_receives    TABLE     �   CREATE TABLE public.donate_receives (
    receive_id integer,
    donator_id integer NOT NULL,
    donate_id integer NOT NULL,
    receive_date date NOT NULL,
    country character varying(255) NOT NULL
);
 #   DROP TABLE public.donate_receives;
       public         heap    postgres    false            �            1259    25059    donates    TABLE     �   CREATE TABLE public.donates (
    donate_id integer,
    donator_id integer NOT NULL,
    price integer NOT NULL,
    donate_date date NOT NULL,
    ship_id integer NOT NULL
);
    DROP TABLE public.donates;
       public         heap    postgres    false            �            1259    25053    donators    TABLE       CREATE TABLE public.donators (
    donator_id integer,
    first_name character varying(255) NOT NULL,
    last_name character varying(255) NOT NULL,
    username character varying(255) NOT NULL,
    age integer NOT NULL,
    country character varying(255) NOT NULL
);
    DROP TABLE public.donators;
       public         heap    postgres    false            �            1259    16826    employee    TABLE     �   CREATE TABLE public.employee (
    employee_id integer NOT NULL,
    first_name character varying(255) NOT NULL,
    last_name character varying(255) NOT NULL,
    manager_id integer
);
    DROP TABLE public.employee;
       public         heap    postgres    false            �            1259    16447    passport    TABLE     �   CREATE TABLE public.passport (
    passport_id integer NOT NULL,
    serial_number integer NOT NULL,
    fk_passport_person integer,
    registration text NOT NULL
);
    DROP TABLE public.passport;
       public         heap    postgres    false            �            1259    16442    person    TABLE     �   CREATE TABLE public.person (
    person_id integer NOT NULL,
    first_name character varying(64) NOT NULL,
    last_name character varying(64) NOT NULL
);
    DROP TABLE public.person;
       public         heap    postgres    false            �            1259    16413 	   publisher    TABLE     �   CREATE TABLE public.publisher (
    publisher_id integer NOT NULL,
    org_name character varying(128) NOT NULL,
    address text NOT NULL
);
    DROP TABLE public.publisher;
       public         heap    postgres    false            �          0    16623    author 
   TABLE DATA           >   COPY public.author (author_id, full_name, rating) FROM stdin;
    public          postgres    false    204   I'       �          0    16615    book 
   TABLE DATA           4   COPY public.book (book_id, title, isbn) FROM stdin;
    public          postgres    false    203   �'       �          0    16631    book_author 
   TABLE DATA           9   COPY public.book_author (book_id, author_id) FROM stdin;
    public          postgres    false    205   �'       �          0    25062    donate_receives 
   TABLE DATA           c   COPY public.donate_receives (receive_id, donator_id, donate_id, receive_date, country) FROM stdin;
    public          postgres    false    209    (       �          0    25059    donates 
   TABLE DATA           U   COPY public.donates (donate_id, donator_id, price, donate_date, ship_id) FROM stdin;
    public          postgres    false    208   �(       �          0    25053    donators 
   TABLE DATA           ]   COPY public.donators (donator_id, first_name, last_name, username, age, country) FROM stdin;
    public          postgres    false    207   ;)       �          0    16826    employee 
   TABLE DATA           R   COPY public.employee (employee_id, first_name, last_name, manager_id) FROM stdin;
    public          postgres    false    206   �)       �          0    16447    passport 
   TABLE DATA           `   COPY public.passport (passport_id, serial_number, fk_passport_person, registration) FROM stdin;
    public          postgres    false    202   ^*       �          0    16442    person 
   TABLE DATA           B   COPY public.person (person_id, first_name, last_name) FROM stdin;
    public          postgres    false    201   �*       �          0    16413 	   publisher 
   TABLE DATA           D   COPY public.publisher (publisher_id, org_name, address) FROM stdin;
    public          postgres    false    200   �*       S           2606    16630    author author_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY public.author
    ADD CONSTRAINT author_pkey PRIMARY KEY (author_id);
 <   ALTER TABLE ONLY public.author DROP CONSTRAINT author_pkey;
       public            postgres    false    204            U           2606    16635    book_author book_author_pkey 
   CONSTRAINT     j   ALTER TABLE ONLY public.book_author
    ADD CONSTRAINT book_author_pkey PRIMARY KEY (book_id, author_id);
 F   ALTER TABLE ONLY public.book_author DROP CONSTRAINT book_author_pkey;
       public            postgres    false    205    205            Q           2606    16622    book book_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY public.book
    ADD CONSTRAINT book_pkey PRIMARY KEY (book_id);
 8   ALTER TABLE ONLY public.book DROP CONSTRAINT book_pkey;
       public            postgres    false    203            W           2606    16833    employee employee_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.employee
    ADD CONSTRAINT employee_pkey PRIMARY KEY (employee_id);
 @   ALTER TABLE ONLY public.employee DROP CONSTRAINT employee_pkey;
       public            postgres    false    206            O           2606    16451    passport passport_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.passport
    ADD CONSTRAINT passport_pkey PRIMARY KEY (passport_id);
 @   ALTER TABLE ONLY public.passport DROP CONSTRAINT passport_pkey;
       public            postgres    false    202            M           2606    16446    person person_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY public.person
    ADD CONSTRAINT person_pkey PRIMARY KEY (person_id);
 <   ALTER TABLE ONLY public.person DROP CONSTRAINT person_pkey;
       public            postgres    false    201            K           2606    16420    publisher pk_publisher_id 
   CONSTRAINT     a   ALTER TABLE ONLY public.publisher
    ADD CONSTRAINT pk_publisher_id PRIMARY KEY (publisher_id);
 C   ALTER TABLE ONLY public.publisher DROP CONSTRAINT pk_publisher_id;
       public            postgres    false    200            Z           2606    16641 &   book_author book_author_author_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.book_author
    ADD CONSTRAINT book_author_author_id_fkey FOREIGN KEY (author_id) REFERENCES public.author(author_id);
 P   ALTER TABLE ONLY public.book_author DROP CONSTRAINT book_author_author_id_fkey;
       public          postgres    false    205    2899    204            Y           2606    16636 $   book_author book_author_book_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.book_author
    ADD CONSTRAINT book_author_book_id_fkey FOREIGN KEY (book_id) REFERENCES public.book(book_id);
 N   ALTER TABLE ONLY public.book_author DROP CONSTRAINT book_author_book_id_fkey;
       public          postgres    false    2897    203    205            [           2606    16834 !   employee employee_manager_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.employee
    ADD CONSTRAINT employee_manager_id_fkey FOREIGN KEY (manager_id) REFERENCES public.employee(employee_id);
 K   ALTER TABLE ONLY public.employee DROP CONSTRAINT employee_manager_id_fkey;
       public          postgres    false    206    2903    206            X           2606    16452 )   passport passport_fk_passport_person_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.passport
    ADD CONSTRAINT passport_fk_passport_person_fkey FOREIGN KEY (fk_passport_person) REFERENCES public.person(person_id);
 S   ALTER TABLE ONLY public.passport DROP CONSTRAINT passport_fk_passport_person_fkey;
       public          postgres    false    202    2893    201            �   +   x�3�t�O�4�3�2�t��LN�4�2�����
�s��qqq ��w      �   ]   x�3�t���VH�/Rp)���L-�442615�2B��&�(��Vs�[X p#d=
*R�rR9�:AJ�L�y�* ƛs��qqq R;$E      �      x�3�4�2bc06�2�&`ژ+F��� Ck�      �   �   x�M��
A�/�I����r�͂"\���v�CH5�DaP��)�������dHhVcM��W
PԹ���}����(�(KK=EB@^��ZF&#z}��f���	[:��a�����K$�02�L�I��C�� ��/R      �   r   x�M���@�v/<��o/鿎G�M��Ȍ������|!�B��`	�Šo8���a�\��h��������^:g�+ܖ��Z�qX�ɑ�53��.E;�н&x�H��J!	      �   �   x�=��
�0Dϓ��D賂P���Ѕ��H��_om���y�Q��:.�%&�s��Dm��LAXUp4{�Cڬ{&{��ǿc�&/����F�G�je�����+J!�m;����-�H"�\�H=vJ�/YJ0�      �   }   x�%��
�@D�ُr�hR(DR�&́<8�`W��.XΛ�L�G�g�%V�2Q@�E/M�a14�zkCau�G/qc���9~1}������W[:�^��\����圹����N�� �&�      �   E   x�3�442615�4���+I-JK���2�4��404�4B5��4��4����KW/V�I�K��b���� �3-      �   5   x�3��KM�.I,��2��O�tJ,J,�H���2�t������/����� ,L�      �   z   x���
�@@�u�Y�N��E܈-�Mڎ�@��d*���X�Ź[8����u�t���
\��L6�U�;��B����d�UA��D��M�Qt�����Z��Ҋ�>.كA��1�c���(�     