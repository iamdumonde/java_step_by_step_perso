## Le POM (Project Object Model) est l'unité fondamental d'un Project
 Maven. C'est un fichier XML qui contient les informations concernant le projet 
ainsi que les détails de configuration
utilisés par Maven pour "builder" le projet.

Les configurations minimales nécessaires dans un fichier POM 
sont les suivantes: 
-projet : l'élément racine

                -modelversion : version du POM actuellement 4.0.0

                -groupId : l'ID du groupe du projet(en général l'addresse URL du site 
                à l'envers ou le package)

                -artifactId : le nom du projet ou de l'artifact

                -version : la version du projet

                ### Les dossiers importants d'un projet Maven
                1- src/main/java
                Ce dossier est utilisé pour stocker les codes java. Il contient
                donc les classes qui constituent la logique de l'application.
                Tous les fichiers ".java" sont crées ici.

                2- src/main/ressources
                Ce dossier est utilisé pour stocker les ressources non java dont l'application 
                aura besoin. Ces ressources peuvent être des fichiers de configuration, 
                des fichiers XML, des images etc ...

                3- src/main/webapp
                Ce dossier est utilisé spécifiquement pour les applications WEB. Il contient
                les ressources web tels que : les fichiers html, JSP, CSS, JS, web.xml(le descripteur
                de déploiement)