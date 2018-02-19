export default {
  items: [
    {
      name: 'Sistema practica',
      url: '/dashboard',
      icon: 'icon-speedometer',

    },
    {
      name: 'Colors',
      url: '/theme/colors',
      icon: 'icon-drop',
    },
    {
      name: 'Usuarios',
      url: '/users',
      icon: 'icon-user',
      children: [
        {
          name: 'Lista',
          url: '/users',
          icon: 'icon-list'
        },
        {
          name: 'Nuevo',
          url: '/users/create',
          icon: 'icon-plus'
        }


      ]
    }
  ]
};
